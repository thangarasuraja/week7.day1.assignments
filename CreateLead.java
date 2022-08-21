package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProductSpecificMethods {
	
	@Given ("click CRMSFA Link")
	public void clickCRMSFA() {
		//click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And ("click the Leads Tap")

	public void clickLeadTap() {
		//click the Leads tab
		driver.findElement(By.linkText("Leads")).click();

	}
	@And ("click the create Leads Link")

	public void clickCreateLeadLink() {
		//Click the Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();

	}
	@And ("Type the companyName as (.*)$")
	public void typeCompanyName(String companyName) {
		
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
	}
	@And ("Type the firstName as (.*)$")
	public void typefirstName(String firstName) {
		
		//Enter the First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}
	@And ("Type the Lastname as (.*)$")
	public void typelastName(String lastName) {
		
		//Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}
	@When ("click the Create Lead Button")

	public void clickCreateLeadButton() {
		
		//click create lead button
		driver.findElement(By.name("submitButton")).click();

	}
	@Then ("Verify the title")
	public void verifyTitle() {
		
		//Get the title
		String title=driver.getTitle();
		
		//Print the title
		System.out.println(title);
		
		//Confirm the title
		if(title.contains("View Lead | opentaps CRM")){
			System.out.println("I confirmed the title");
		}
		else
		{
			System.out.println("Title does not contain the word View Lead | opentaps CRM");
		}

	}

}
