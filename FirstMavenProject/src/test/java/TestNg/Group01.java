package TestNg;

import org.testng.annotations.Test;

public class Group01 {
		
		@Test (groups="functional")
		public void login() {
			System.out.println("Functional Login");
		}
		@Test(groups="integeration")
		public void customer() {
			System.out.println("Integeration Customer");
		}
		@Test (groups="functional")
		public void addProduct() {
			System.out.println("Functional addProduct ");
		}
		@Test (groups="adhoc")
		public void logout() {
			System.out.println("Adhoc logout");
		}
				
		}
