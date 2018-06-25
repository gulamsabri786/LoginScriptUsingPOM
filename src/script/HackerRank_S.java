package script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.HackerRankPage;

public class HackerRank_S extends BaseTest {
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.hackerrank.com/dashboard");
    HackerRankPage h=new HackerRankPage(driver);
    h.LoginBT();
    h.username("sabrisait786@gmail.com");
    h.password("sabrisait");
    h.login();
	BasePage.VerifypageisDisplay(driver,"Dashboard | HackerRank");	
	}


}
