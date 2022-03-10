package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	//used Regular expressions starts and ends
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	   System.out.println("user is on login page");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		   System.out.println("user enters username and password");

	}   

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		   System.out.println("user clicks on login button");

	}

	@Then("^user navigate to home page$")
	public void user_navigate_to_home_page() {
	   
	}

	@When("^user enters user1 and pass1$")
	public void user_enters_user1_and_pass1() {
	  
	}

	@When("^user enters user2 and pass2$")
	public void user_enters_user2_and_pass2() {
	   
	}


	    } 
	    
	


