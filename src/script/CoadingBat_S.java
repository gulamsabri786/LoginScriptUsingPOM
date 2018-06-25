package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.CoadingBatPage;

public class CoadingBat_S extends BaseTest {

	@Test
	public void test() throws Exception
	{
		driver.get("http://codingbat.com/java");
		CoadingBatPage c=new CoadingBatPage(driver);
		c.username("sabrisait786@gmail.com");
		c.password("sabrisait");
		c.login();
		BasePage.VerifypageisDisplay(driver,"CodingBat Java");	
	}

}
