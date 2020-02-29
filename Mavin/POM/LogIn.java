package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {
	public static WebDriver driver;
	
	@FindBy(id="Email")
	public WebElement EmailTextField;
	
	@FindBy(id="Password")
	public WebElement PasswordTextField;
	
	@FindBy(id="RememberMe")
	public WebElement RememberMeField;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	public WebElement LogInButton ;
	
	public void ValidLogIn(String username,String password)
	{
		EmailTextField.clear();
		EmailTextField.sendKeys(username);
		PasswordTextField.clear();
		PasswordTextField.sendKeys(password);
		LogInButton.click();
	}
	
	

}
