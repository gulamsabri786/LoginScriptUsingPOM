package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.TestspotPage;

public class TestsPot_S extends  BaseTest{
	@Test
	public void test() throws Exception
	{
		driver.get("https://testpot.com/");
    TestspotPage h=new TestspotPage(driver);
    h.LoginBT();
    h.username("sabrisait786@gmail.com");
    h.password("sabrisait");
    h.login();
	BasePage.VerifypageisDisplay(driver,"Testpot.com | Free Mock Tests Online Tests and more...");	
	}


}
