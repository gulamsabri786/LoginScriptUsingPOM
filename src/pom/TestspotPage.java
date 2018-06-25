package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestspotPage {
	@FindBy(xpath="//a[.='Login / Register ']")
	private WebElement Login;
	@FindBy(xpath="//input[@id='login_email']")
	private WebElement UserName;
	@FindBy(xpath="//input[@id='login_password']")
	private WebElement password;
	@FindBy(xpath="//button[@id='login_btn']")
	private WebElement logIN;
	public TestspotPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginBT()
	{
		Login.click();
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
