package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProductSpecificMethods {
	
	@Given ("click the CRMSFA Link")
	public void clickCRMSFA() {
		//click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@And ("Click the Leads Tap")
	public void clicktheLeadsTap() {
		//click the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
	}
	@And ("Click the Find Leads Link")
	public void clickfindLeadsLink() {
		//click the Find Leads link
		driver.findElement(By.linkText("Find Leads")).click();
		
	}
	@And ("Type the firstName1 as {string}")
	public void typeFirstName1(String firstName1) {
		//Enter the First name 

		driver.findElement(By.xpath("(//div[@class='x-form-element'])[19]/input")).sendKeys(firstName1);
	}
	@When ("Click the FindLeads button")
	public void clicktheFindLeadsButton() throws InterruptedException {
		//Click Find lead button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		//Thread
		Thread.sleep(3000);
		
	}
	@And ("Click the first record in the Grid")
	public void clickFirstRecord() {
		//click the first record
		driver.findElement(By.xpath("(//div[contains (@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();
	}
	@And ("click the Edit button")
	public void clickEditButton() {
        //Click Edit button
		
		driver.findElement(By.linkText("Edit")).click();
		
	}
	@And ("Edit the companyName as {string}")
	public void editCompanyName(String companyName1) {
		//Edit the company name
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName1);
		
	}
	@And ("click update button")
	public void clickUpdateButton() {
		//click update
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
	}
	@Then ("Verify the companyName updation")
	public void verifyTitle() throws InterruptedException {
	//get the company name
		
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		//split the numericvalue and company name 
		
		String companyname=text.replaceAll("[^a-zA-Z]", "");
		
		System.out.println("Companyname = "+companyname);
		
		//compare the title
		
		if(companyname.equalsIgnoreCase("ZOHO")) {
			System.out.println("Valid company name updated");
		}
		else {
			System.out.println("invalid company name updated");
		}
		
		//Thread sleep
		
		Thread.sleep(5000);
		
	}

}
