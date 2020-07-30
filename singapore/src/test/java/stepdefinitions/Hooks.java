package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	
	@After("@DbsTest")
	public void Aftervaldiation()
	{
		DbsSg.driver.close();
	}
		
		
	}

