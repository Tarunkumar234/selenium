package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	public static WebDriver driver;
	
	@FindBy(id="gender-male")
	public WebElement Male;
	
	@FindBy(id="gender-female")
	public WebElement Female;
	
	@FindBy(id="FirstName")
	public WebElement FirstNameField;
	
	@FindBy(id="LastName")
	public WebElement LastNameField;
	
	@FindBy(id="Email")
	public WebElement EmailTextField;
	
	@FindBy(id="Password")
	public WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	public WebElement ConformPasswordField;
	
	@FindBy(id="register-button")
	public WebElement RegisterButton;
	
	public void registration(String first,String last, String mail,String pass,String cnfpass)
	{
		Male.click();
		FirstNameField.clear();
		FirstNameField.sendKeys(first);
		LastNameField.clear();
		LastNameField.sendKeys(last);
		EmailTextField.clear();
		EmailTextField.sendKeys(mail);
		PasswordTextField.clear();
		PasswordTextField.sendKeys(pass);
		ConformPasswordField.clear();
		ConformPasswordField.sendKeys(cnfpass);
		RegisterButton.click();
	}
	
	public void invalidregistration(String first,String last, String mail,String pass,String cnfpass)
	{
		Male.click();
		FirstNameField.clear();
		FirstNameField.sendKeys(first);
		LastNameField.clear();
		LastNameField.sendKeys(last);
		EmailTextField.clear();
		EmailTextField.sendKeys(mail);
		PasswordTextField.clear();
		PasswordTextField.sendKeys(pass);
		ConformPasswordField.clear();
		ConformPasswordField.sendKeys(cnfpass);	
		RegisterButton.click();
	}


}
