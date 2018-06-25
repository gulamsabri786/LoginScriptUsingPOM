package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Aautoconst{
	  public WebDriver driver;
		
	  static
	  {
	    System.setProperty(GECKO_KEY,GECKO_VALUE);
	  }
	  @BeforeMethod
	  public void before() throws Exception
	  {
	  	//driver=new ChromeDriver();
		  driver=new FirefoxDriver();
	  	
	  	String sIW=PropertyFile.getProperties(Aautoconst.PROPERTIES_FILE,"ITO");
		long IW=Long.parseLong(sIW);
	  	driver.manage().timeouts().implicitlyWait(IW,TimeUnit.SECONDS);
	  }
	  
	  @AfterMethod
	  public void after()
	  {
	   driver.close();
	  	
	  }


}
