package POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelOrPageFactory {

	public static WebDriver driver;

	static Register register;
	static LogIn login;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		register = PageFactory.initElements(driver, Register.class);
		login = PageFactory.initElements(driver, LogIn.class);

		register.invalidregistration("Tarun", "kumar", "kumartharun243gmail.com", "a98765412","a98765412" );

		register.registration("Tarun", "kumar", "kumartharun7600@gmail.com", "a78945612", "a78945612");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

		login.ValidLogIn("kumartharun765@gmail.com","a78945612");
		ScreenShot("C:\\Users\\BLTuser.BLT146\\Desktop\\New folder(2)\\ValidLogIn.jpg");

		driver.close();

	}

	public  static void ScreenShot(String string)
	{
		File ScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try
		{
			String screenshotLocation = string;
			FileUtils.copyFile(ScreenShot,new File(screenshotLocation));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
