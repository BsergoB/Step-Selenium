# e2e-tests Selenium Webdriver

e2e-test for Step application with Selenium Webdriver

## Setup on Windows

- Download and install the latest version of IntelliJ IDEA
- Download Maven tool from <https://maven.apache.org/download.cgi> in binary format (apache-maven-version-bin.zip). Next extract zip archive to e.g. C:\Program Files\Maven. Then you have to set environment variables M2_HOME и MAVEN_HOME as well as add Maven/bin directory to PATH variable. Eventually check your installation by executing "mvn -v"  in command line.
- Clone and checkout the github project
- Copy project folder to "C:\Users\<User>\IdeaProjects\"
- Follow this documentation to install the Open-Source version of step application on-premise on your laptop <https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/> and start it. Pay attention to downloaded archives step-controller-3.xx.x and step-agent-3.xx.x. They don't have specified batch files for starting MongoDB Server, so you have to do it manually by executing "net start MongoDB". As well as you should set JAVA_PATH in both files startController.bat and startAgent.bat

### How to run the tests on Windows

Open project in IntelliJ IDEA. Expand project structure and select TestCase001.java in test\java\specs folder. Next you can run test from Run menu or by clicking Run button leftward to TestCase001 class declaration. 

### Description

Project contains simple JUnit test that will perform a login to your local step instance using the Selenium framework (the browser must be Chrome or Chromium). The test extended with browsing the step tabs (Plans, Keywords, Parameters, etc.) and making sure that the tab is loaded (lookup for an element on the page) before moving to the next one.

### Test structure

We work with the Page Object Pattern described in <https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/>. The main idea is to encapsulate logic into page classes and use the class methods in the spec files to build the tests. For instance we defined the LoginPage with class fields as elements locators and class methods as actions. This way allows to reduce the amount of duplicated code and reuse it in future.

### Project structure
We use the Maven dependency management tool. Maven is configured in pom.xml file and allows automatic operations with project dependencies. You can search maver artifacts at <https://mvnrepository.com/> In this project we use Selenium Java <https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0>, WebDriverManager <https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.1.1> and JUnit Jupiter API <https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.2>
