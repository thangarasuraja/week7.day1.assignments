package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends ProductSpecificMethods {
	
	@Given ("Type the username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		
	}
	@And ("Type the password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	@When ("click Login")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then ("Verify the Home page is displayed")
	public void verifyHomePage()   {
		
		WebElement webElement = driver.findElement(By.xpath("//div[@id='form']/h2"));
		
		String text = webElement.getText();
		
		
		if(text.contains("Welcome")){
			System.out.println("Home page verified");
		}
		else {
			System.out.println("Home page not verified");
		}
		
		
	}
	@But ("error message displayed")
	public void verifyErrorMessage()   {
		
		WebElement webElement2 = driver.findElement(By.xpath("//div[@id=\"errorDiv\"]"));
		String text = webElement2.getText();

		if(text.contains("User not found.")){
			System.out.println("error message verified");
		}
		else {
			System.out.println("Error message  not verified");
		}
		
		
		
	}
}
