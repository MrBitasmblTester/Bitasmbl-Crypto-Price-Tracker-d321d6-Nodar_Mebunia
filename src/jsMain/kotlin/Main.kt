package app

import react.create
import react.dom.client.createRoot
import kotlinx.browser.document

fun main() {
  val root = createRoot(document.getElementById("root")!!)
  root.render(CryptoApp.create())
}
