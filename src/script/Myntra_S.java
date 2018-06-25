package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.MyntraPage;

public class Myntra_S extends BaseTest{
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		MyntraPage c=new MyntraPage(driver);
		c.username("sabrisait786@gmail.com");
		c.password("sabrisait");
		c.login();
		BasePage.VerifypageisDisplay(driver,"Login");	
	}

}
