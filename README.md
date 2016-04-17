# home_away
1. This project is created using Cucumber BDD and Maven
2. Path of reporsitory is: https://github.com/niteshchaudhary/home_away.git
3. To execute the project, please follow below steps:
    a. Clone project to Eclipse
    b. Go to Run configurations and paste goals as: clean install -Dtest=RunTest test -Dcucumber.options="--tags @test
    c. Click on Apply and then on Run
4. Cucumber report is generated after the tests are run and it is stored at: <project directory>\target\cucumber\ui\index.html
for eg. C:\Users\Nitesh\git\home_away\target\cucumber\ui\index.html
