package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.LinkedinPage;

public class Linkedin_S extends BaseTest {

	@Test
	public void test() throws Exception
	{
		driver.get("https://in.linkedin.com/");
	LinkedinPage c=new LinkedinPage(driver);
		c.username("sabrisait786@gmail.com");
		c.password("sabrisait");
		c.login();
		BasePage.VerifypageisDisplay(driver,"LinkedIn");	
	}

}
