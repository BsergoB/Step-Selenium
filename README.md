# Step-Selenium
-Follow this documentation to install the Open-Source version of step application on-premise on your laptop (https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/) and start it.
- Install Chrome and the appropriate version of ChromeDriver on your laptop (https://chromedriver.chromium.org/downloads). Or use Webdrivermanager as Maven dependency
- Start a new Maven Java project with the Selenium test framework as a dependency (https://www.selenium.dev/documentation/webdriver/)
- Set the Junit Jupiter API as Maven dependency
- Project contains simple JUnit test that will perform a login to your local step instance using the Selenium framework (the browser must be Chrome or Chromium). The test extended with browsing the step tabs (Plans, Keywords, Parameters, etc.) and making sure that the tab is loaded (lookup for an element on the page) before moving to the next one.
