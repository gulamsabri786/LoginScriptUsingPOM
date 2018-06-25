package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.InstragramPage;

public class Instragram_S extends BaseTest {
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.instagram.com/accounts/login/");
		InstragramPage c=new InstragramPage(driver);
		c.username("sabrisait786@gmail.com");
		c.password("sabrisaitsmd");
		c.login();
		BasePage.VerifypageisDisplay(driver,"Login • Instagram");	
	}

}
