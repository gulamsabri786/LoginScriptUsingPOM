package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonePage {
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement UserName;
	@FindBy(id="continue")
	private WebElement Continue;
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement logIN;
	public AmazonePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String user)
	{
		UserName.sendKeys(user);
	}
	public void cntinue()
	{
		Continue.click();
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
    public void login()
    {
    	logIN.click();
    }
   
}
