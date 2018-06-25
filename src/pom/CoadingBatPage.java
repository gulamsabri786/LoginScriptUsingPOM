package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoadingBatPage {
	@FindBy(name="uname")
	private WebElement UserName;
	@FindBy(name="pw")
	private WebElement password;
	@FindBy(name="dologin")
	private WebElement logIN;
	public CoadingBatPage (WebDriver driver)
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
