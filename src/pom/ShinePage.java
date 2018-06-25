package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShinePage {
	@FindBy(name="email")
	private WebElement UserName;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='btn_login']")
	private WebElement logIN;
	public ShinePage(WebDriver driver)
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
