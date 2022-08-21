Feature: Edit the Lead in LeafTap Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When click Login

Scenario:
Given click the CRMSFA Link
And Click the Leads Tap
And Click the Find Leads Link
And Type the firstName1 as "Suresh"
When Click the FindLeads button
And Click the first record in the Grid
And click the Edit button
And Edit the companyName as "Zoho"
And click update button
Then Verify the companyName updation
