package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HackerRankPage {
	@FindBy(xpath="//button[@class='login pull-right btn btn-dark btn-default mmT']")
	private WebElement Login;
	@FindBy(xpath="//input[@type='text']")
	private WebElement UserName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logIN;
	public HackerRankPage(WebDriver driver)
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
