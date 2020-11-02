#UI Automation Test
Added 6 scenarios in BDD format 
1. One scenario for successful user registration
2. One scenario to verify the user is able to add product successfully to the cart
3. Two scenarios for successful user login
4. Two scenarios to verify authentication error for unsuccessful login

#Prerequisite to run the tests
- Java 8 and above.
- Maven


##Run Test

Tests can be executed in following ways 

1. By executing `RunCucumberTests.java` file
2. From command line by writing `mvn clean test`

#Project description

1. `Maven` is used as the build tool
2. `Pico container` is used for `Dependency Injection`
3. `Cucumber` is used to write feature files
4. `Page Object` and `Page Factory pattern` is implemented
5. `Singleton pattern` implemented to initialise the WebDriver
6. `Javafaker` is used to generate test data
7. `config.properties` is used for configuration
8. `Assertj` is used as fluent assertions 

##Reports

Pretty format report is generated at `target/site/cucumber-pretty/index.html`. 
Default format of cucumber report is currently used, this can be further enhanced using Extent reports plugins.
