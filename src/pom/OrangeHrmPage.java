package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPage {
	@FindBy(id="txtUsername")
	private WebElement UserName;
	@FindBy(id="txtPassword")
	private WebElement password;
	@FindBy(id="btnLogin")
	private WebElement logIN;
	public OrangeHrmPage(WebDriver driver)
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
