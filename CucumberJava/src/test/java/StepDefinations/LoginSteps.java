package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	//used Regular expressions starts and ends
	WebDriver driver =null;
	
	@Given("^ browser is open$")
	public void browser_is_open() {
	System.out.println("browser is open");
    System.setProperty("webdriver.chrome.driver","CucumberJava/src/test/resources/drivers/chromedriver.exe");
    driver= new ChromeDriver();
    //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
	
	}
	
	
	@And("^user is on login page$")
	public void user_is_on_login_page() {
	  // System.out.println("user is on login page");
	   driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters username(.*) and password(.*)$")
	public void user_enters_username_and_password(String username,String password ) throws InterruptedException {
		 driver.findElement(By.id("name")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 Thread.sleep(2000);
		  // System.out.println("user enters username and password");

	}   

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
		  // System.out.println("user clicks on login button");

	}

	@Then("^user navigate to home page$")
	public void user_navigate_to_home_page() throws InterruptedException {
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	   
	}

	   
	}


	     
	    
	


