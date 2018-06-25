package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage{
	@FindBy(xpath="//input[@id='email']")
	private WebElement UserName;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement logIN;
	public FacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String user)
	{
		UserName.sendKeys(user);
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
