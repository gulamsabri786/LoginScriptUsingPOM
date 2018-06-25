package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.ShinePage;

public class Shine_S extends BaseTest {
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.shine.com/myshine/login/");
		ShinePage c=new ShinePage(driver);
		c.username("sabrisait786@gmail.com");
		c.password("sabrisait");
		c.login();
		BasePage.VerifypageisDisplay(driver,"Shine.com - My Shine | Home");	
	}

}
