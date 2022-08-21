package stepDefs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductSpecificMethods extends AbstractTestNGCucumberTests{
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void init() {
		launchBrowser();
		loadAndMaximize();
	}
		
		public void loadAndMaximize() {
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
		
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		@AfterMethod
		public void browserClose()  {
			driver.close();
		}

}
