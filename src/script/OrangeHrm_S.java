package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.OrangeHrmPage;

public class OrangeHrm_S extends BaseTest {

	@Test
	public void test() throws Exception
	{
		driver.get("http://opensource.demo.orangehrmlive.com/");
		OrangeHrmPage c= new OrangeHrmPage(driver);
		c.username("admin");
		c.password("admin");
		c.login();
		BasePage.VerifypageisDisplay(driver,"OrangeHRM");	
	}


}
