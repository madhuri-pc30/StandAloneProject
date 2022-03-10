package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class LoginHooks {
	
	
	
	@Before(order=1)
	public void setup_browser() {
		System.out.println("launch browser");
	}

	@Before(order=2)
	public void setup_url() {
		System.out.println("launch url");
	}
	
	
	@After(order=1)
	public void tearDown_logout() {
		System.out.println("logout from application");
	}
	@After(order=2)
	public void tearDown_close() {
		System.out.println("close browser");
	}
	
	@BeforeStep
	public void takescreenshot() {
		System.out.println("take the screenshot");	
		
	}
	@AfterStep
	public void refreshpage() {
		System.out.println("refresh the page");	
		
}
}