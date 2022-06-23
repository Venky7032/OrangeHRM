package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2 {
	
	static WebDriver driver;
	
	@When("^I open OpenOrangeHRM websitek$")
	public void i_open_OpenOrangeHRM_websitek() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Given("^Sign in Detailsk$")
	public void sign_in_Detailsk() throws Throwable {
		
		System.out.println("Hello12");
	}

	@Given("^I created Nationality Recordk$")
	public void i_created_Nationality_Recordk() throws Throwable {
	    
		System.out.println("Hello13");
	}

	@Then("^I sign outk$")
	public void i_sign_outk() throws Throwable {
		
		System.out.println("Hello14");
	}



}
