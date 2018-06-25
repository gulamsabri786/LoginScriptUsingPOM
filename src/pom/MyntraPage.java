package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPage {
	@FindBy(xpath="//input[@type='email']")
	private WebElement UserName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[.='Log in']")
	private WebElement logIN;
	public MyntraPage (WebDriver driver)
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
