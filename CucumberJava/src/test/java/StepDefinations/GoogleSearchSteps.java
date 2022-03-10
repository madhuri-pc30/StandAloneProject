package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	 
	WebDriver driver =null;


    @Given("^browser is open$")
    public void browser_is_open() {
    	System.out.println("inside steps- user open browser");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
    }
       

    @And("^user is on google search page$")
    public void user_is_on_google_search_page()  {
    	System.out.println("inside steps- user is on google search page");
    	driver.navigate().to("https://www.google.com/");
    
    }
    	
        
    @When("^user enters a text in search box$")
    public void user_enters_a_text_in_search_box()  {
    	System.out.println("inside steps- user enters text");
      WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
      searchbox.sendKeys("cucumber.io");
    }
    
    @And("^hits enter$")
    public void hits_enter() throws Throwable {
    	System.out.println("inside steps- hits enter");
    	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
     
    }
    
    @Then("^user navigated to search results$")
    public void user_navigated_to_search_results()  {
    	System.out.println("inside steps- user navigated to search result");
    	driver.getPageSource().contains("10 Minute Tutorial");
    	driver.close();
    }

    }

