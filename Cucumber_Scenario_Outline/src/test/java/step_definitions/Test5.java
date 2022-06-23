package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test5 {
	
	@When("^I open OpenOrangeHRM websitep$")
	public void i_open_OpenOrangeHRM_website() throws Throwable {
	    
		System.out.println("Hello1");
	}

	@Given("^Sign in Detailsp$")
	public void sign_in_Details() throws Throwable {
		System.out.println("Hello2");
	}

	@Given("^I created Nationality Recordp$")
	public void i_created_Nationality_Record() throws Throwable {
		System.out.println("Hello3");
	}

	@Then("^I sign outp$")
	public void i_sign_out() throws Throwable {
		System.out.println("Hello4");
	}

}
