package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;

import pom.ActiTimePage;

public class ActitimeS  extends BaseTest{
	 
	@Test
	public void page() throws Exception
	{
		driver.get("https://demo.actitime.com/login.do");
		ActiTimePage A=new ActiTimePage(driver);
		A.username("admin");
		A.password("manager");
		A.login();
		BasePage.VerifypageisDisplay(driver,"actiTIME");	
	}

}
