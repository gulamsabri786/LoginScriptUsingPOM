package script;
import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom.FlipkartPage;

public class Flipkart_s extends BaseTest {
	@Test
	public void test() throws Exception
	{
      driver.get("https://www.flipkart.com/");
     FlipkartPage f=new FlipkartPage(driver);
     f.login_SignUp(driver);
     f.userName("sabrisait786@gmail.com");
     f.password("sabrisait");
     f.login();
		BasePage.VerifypageisDisplay(driver,"Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More");
		
	}

}
