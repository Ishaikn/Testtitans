package TestNg;

import org.testng.annotations.Test;

public class PracticeAllAnnotationAndArguments {
	@Test(priority = 1)
	public void login()
	{
	System.out.println("Login");
	
	}
@Test (priority = 3, invocationCount = 5)  // invocationcount= number of time it need to be executed
	public void product()
	{
	
		System.out.println("Product");
	}
@Test (priority = 2)
	public void home()
	{
		System.out.println("Home");
		
	}
@Test (priority = 5)
	public void logout()
	{
		System.out.println("Logout");
			
	}
@Test (priority = 4, enabled = false)
	public void payment()
	{
	
		System.out.println("Payment");
		
	}


}
