Feature: login into apilication

Scenario Outline: positive test application login
Given intilize the browser with chorme
And Navigate to "http://www.qaclickacademy.com"
And click on login button in home page to land sercure sigh in
When user enters <username> and <password>
Then verify and login succesfull
And close browser

Examples:
|username 						|password|
|Ravikiran.ruttala@gmail.com	|thelidhu|
|test99@gmail.com				|chepanu|
|ruttala.Ravi@gmail.com			|1234567890|
