package app

import react.*
import react.dom.html.ReactHTML.*
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

private val scope = MainScope()

val CryptoApp = FC<Props> {
  val (query,setQuery) = useState("")
  val (coins,setCoins) = useState<List<dynamic>>(emptyList())

  useEffectOnce {
    scope.launch {
      val r = window.fetch("https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&per_page=50").await()
      val txt = r.text().await()
      // TODO: parse JSON (kotlinx.serialization) and call setCoins(parsed)
    }
  }

  div { className = "p-4 max-w-4xl mx-auto"
    input { className = "mb-4 p-2 border rounded w-full"; placeholder = "Search by name or symbol"; value = query; onChange = { setQuery((it.target as org.w3c.dom.HTMLInputElement).value) } }
    // TODO: render table rows filtering coins by query; use Tailwind classes for responsive table
  }
}
