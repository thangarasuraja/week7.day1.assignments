Feature: Create the Lead in LeafTap Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When click Login


Scenario Outline:
Given click CRMSFA Link
And click the Leads Tap
And click the create Leads Link
And Type the companyName as <companyName>
And Type the firstName as <firstName>
And Type the Lastname as <lastName>
When click the Create Lead Button
Then Verify the title

Examples:
|companyName|firstName|lastName|
|Amazon|Suresh|Nagarajan|
|flipcart|Ganesh|Palanisany|