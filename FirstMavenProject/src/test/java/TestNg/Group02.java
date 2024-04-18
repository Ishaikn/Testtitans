package TestNg;

import org.testng.annotations.Test;

public class Group02 {
	@Test (groups="functional")
	public void product() {
		System.out.println("Functional product");
	}
	@Test(groups="integeration")
	public void payment() {
		System.out.println("Integeration Payment");
	}
	@Test (groups="functional")
	public void removeProduct() {
		System.out.println("Functional removeProduct ");
	}
	@Test (groups="smoke")
	public void homePage() {
		System.out.println("smoke homePage");
	}


}
