package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_StepDefinition {
	
	@Before
	public void setUP() {
		System.out.println("launch FF");
		System.out.println("Enter URL for free CRM APP");
	}
	
	@After
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page()  {
	    
	}

	@When("^user fills the deals form$")
	public void user_fills_the_deals_form()  {
	    
	}

	@Then("^deal is created$")
	public void deal_is_created() {
		
	}

}
