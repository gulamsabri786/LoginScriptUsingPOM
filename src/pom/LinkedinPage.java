package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinPage {
	@FindBy(id="login-email")
	private WebElement UserName;
	@FindBy(id="login-password")
	private WebElement password;
	@FindBy(id="login-submit")
	private WebElement logIN;
	public  LinkedinPage(WebDriver driver)
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
