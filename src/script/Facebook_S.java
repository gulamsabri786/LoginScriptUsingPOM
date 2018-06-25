package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.FacebookPage;

public class Facebook_S extends BaseTest
{
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.facebook.com");
		FacebookPage f=new FacebookPage(driver);
		f.username("sabrisait786@gmail.com");
		f.password("sabrisait");
		f.login();
		
		BasePage.VerifypageisDisplay(driver,"Facebook");	
	}
}
