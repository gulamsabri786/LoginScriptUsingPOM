package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class InstragramPage extends BasePage
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement UserName;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[.='Log in']")
	private WebElement logIN;
	public InstragramPage(WebDriver driver)
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
