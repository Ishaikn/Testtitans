package TestNg;

import org.testng.annotations.Test;
public class AllAnnotationarguments {
@Test (priority=2)
public void login() {
	System.out.println("login");	
}
@Test (priority=3, invocationCount=2)
public void product() {
	System.out.println("product");}
@Test (priority=1)
public void home() {
	System.out.println("home");}
@Test (priority=5, enabled=false)
public void logout() {
	System.out.println("logout");}
@Test(priority=4)
public void payment() {
	System.out.println("payment");
	
}
@Test
public void get()
{
	System.out.println("hi");
}
}