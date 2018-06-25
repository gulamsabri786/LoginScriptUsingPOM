package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class FlipkartPage extends BasePage
{
	@FindBy(xpath="//a[.='Login & Signup']")
	private WebElement Login_SignUp;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement UserName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement logIN;
	public FlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login_SignUp(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, Login_SignUp);
	}
	public void userName(String un)
	{
		UserName.sendKeys(un);
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
