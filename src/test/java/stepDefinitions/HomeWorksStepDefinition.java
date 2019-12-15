package stepDefinitions;

import java.io.IOException;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomeWorksPageObjects;
import utilities.Utility;

public class HomeWorksStepDefinition extends Base {
	
	
	HomeWorksPageObjects elementFinder = new HomeWorksPageObjects();
	
	@When("^User click on test environmet link$")
	public void user_click_on_Test_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
		elementFinder.clickOnTestLink();

	}
	
	@Then("^User should see the test environment link$")
	
	public void user_should_see_Test_page() {
	
		System.out.println("Test Case 2 Passed");
			
	}
	
	@When("^User clicks on Log in under MyAccount Drop down$")
	
	public void user_click_on_log_in() {
		
		elementFinder.clickOnLogin();
	}
	
	@And("^User enters e mail address '(.+)' and password '(.+)'$")
	
	public void user_enters_EmailAndPassowrd(String userName, String passWord) {
		
		elementFinder.enterEmailAddress(userName);
		elementFinder.enterPassword(passWord);
		
	}
	
	@And("^User clicks on Log in$")
	
	public void user_click_on_LogIn() {
		elementFinder.clickOnLogin();
	}
	
	@Then("^User should be able to log in$")
	public void user_should_see_log_in() {
		
		System.out.println("Test Case 3 passed ");
	}
	
	
	@When("$User clicks Logs In with info'$")
	
	public void user_is_loggedIN(String useName, String pasWord) {
		
		elementFinder.enterEmailAddress(useName);
		elementFinder.enterPassword(pasWord);
	}
	
	@Then("User should be logged out")
	public void user_should_logged_out() {
		
		elementFinder.clickOnLogOut();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
