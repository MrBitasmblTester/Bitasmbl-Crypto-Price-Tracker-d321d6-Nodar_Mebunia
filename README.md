# Bitasmbl-Crypto-Price-Tracker-d321d6-Nodar_Mebunia

## Description
A sleek React application that tracks live cryptocurrency prices using the CoinGecko API. It allows users to search and view details of top cryptocurrencies, including name, symbol, current price, and price change percentage. This project focuses on API integration, dynamic table rendering, and clean responsive UI using Tailwind CSS.

## Tech Stack
- Kotlin

## Requirements
- Style the UI using Tailwind CSS for responsive layout
- Fetch live cryptocurrency data from CoinGecko API
- Use React hooks for state and effects
- Implement search and filter functionality

## Installation
Follow these step-by-step instructions to set up the project locally.

1. Clone the repository (use the provided Repo Owner Username):
   - git clone https://github.com/MrBitasmblTester/Bitasmbl-Crypto-Price-Tracker-d321d6-Nodar_Mebunia.git
2. Change into the project directory:
   - cd Bitasmbl-Crypto-Price-Tracker-d321d6-Nodar_Mebunia

Frontend (React + Tailwind):
3. Ensure Node.js and npm are installed on your machine. Verify with:
   - node -v
   - npm -v
4. Install frontend dependencies where package.json is located (root or frontend folder):
   - npm install

Kotlin (selected tech stack):
5. Ensure Kotlin is installed on your machine. Verify with:
   - kotlinc -version

   Example install commands (choose appropriate for your OS):
   - macOS (Homebrew): brew install kotlin
   - Debian/Ubuntu: sudo apt-get update && sudo apt-get install -y kotlin

6. If the repository contains Kotlin source files and you need to compile them, a general compile/run sequence is:
   - kotlinc -include-runtime -d app.jar src/**/*.kt
   - java -jar app.jar
   - or run via kotlin if appropriate: kotlin -classpath app.jar MainKt

Notes:
- No environment variables are required by default for accessing the public CoinGecko API.

## Usage
Start and run the project using the following minimal commands based on typical frontend setup and the selected tech stacks.

Frontend (React + Tailwind):
1. Install dependencies (if not already done):
   - npm install
2. Start the development server (common scripts; use the one defined in package.json):
   - npm start
   - or
   - npm run dev
3. Open your browser and navigate to http://localhost:3000 (or the port reported by the dev server).

Kotlin (if present and used in this repository):
1. Compile Kotlin sources if applicable:
   - kotlinc -include-runtime -d app.jar src/**/*.kt
2. Run the compiled artifact:
   - java -jar app.jar
   - or
   - kotlin -classpath app.jar MainKt

## Implementation Steps
1. Clone the repository and open it in your editor:
   - git clone https://github.com/MrBitasmblTester/Bitasmbl-Crypto-Price-Tracker-d321d6-Nodar_Mebunia.git
   - cd Bitasmbl-Crypto-Price-Tracker-d321d6-Nodar_Mebunia
2. Ensure Node.js/npm and Kotlin are installed and available in PATH.
3. Install frontend dependencies where package.json exists:
   - npm install
4. Configure Tailwind CSS in the frontend build (add Tailwind directives to your CSS and ensure the build tool reads tailwind.config.js). Use the Tailwind utility classes throughout components to achieve a clean responsive UI.
5. Create a React component structure with functional components and hooks. Key components:
   - App (root)
   - CoinsTable (renders list/table of coins)
   - SearchBar (controlled input for filtering)
   - CoinRow (row for each cryptocurrency)
6. Use React hooks for state and side effects:
   - useState to store the coins list, search query, and filtered results.
   - useEffect to fetch live data from CoinGecko on mount and on interval if desired.
7. Fetch live cryptocurrency data from CoinGecko API using the public markets endpoint. Example fetch URL:
   - https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false
   - Use fetch(...) inside useEffect, parse JSON, and update state with the resulting array of coin objects.
8. Dynamically render the returned data in a responsive table or list using Tailwind CSS classes. Display fields such as name, symbol, current_price, and price_change_percentage_24h.
9. Implement search and filter functionality:
   - Bind SearchBar input to a state variable (query).
   - Derive filtered results by applying .filter on the coins array using case-insensitive checks against name and symbol.
   - Render the filtered list in CoinsTable.
10. Add UI polish and responsiveness using Tailwind utility classes (responsive table layout, truncated text, color-coded price changes, hover states, and mobile-friendly stacking).
11. Handle loading and error states in the UI: show a loading indicator while fetching and a friendly error message on fetch failures.
12. (Optional) If Kotlin sources are present for supplementary functionality, compile and run them as needed using kotlinc and java as described in Installation.

## API Endpoints (Optional)
No backend API routes are implied by the provided tech stacks and requirements. The frontend fetches data directly from the CoinGecko public API.