package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AccountLoginPage extends BasePage{
	
	public AccountLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtLoginEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtLoginPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String email)
	{
		txtLoginEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtLoginPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
}
