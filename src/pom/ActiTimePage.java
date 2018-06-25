package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
;

public class ActiTimePage {
	@FindBy(id="username")
	private WebElement UserName;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logIN;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	public ActiTimePage (WebDriver driver)
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

