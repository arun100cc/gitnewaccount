package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {

		System.out.println("Open Chromebrowser");
		System.out.println("Open Facebook Application");
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
		System.out.println("Enter valid email and invalid password");
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		System.out.println("Click Login Button");
	}

	@Then("User have to show credetials page")
	public void user_have_to_show_credetials_page() {
System.out.println("Open New Credential Page");
	}

}
