Feature: Login to the LeafTap application

Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When click Login
Then Verify the Home page is displayed

Scenario: Negative Login
Given Type the username as 'DemoSalesManager1'
And Type the password as 'crmsfa'
When click Login
But error message displayed