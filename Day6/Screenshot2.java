package Day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {
	static WebDriver dr;
	public static void ScreenShot()
	{
		File ScreenShot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		try
		{
			String screenshotLocation = "C:\\Users\\BLTuser.BLT146\\Desktop\\New folder\\exceptions.png";
			FileUtils.copyFile(ScreenShot,new File(screenshotLocation));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		dr.findElement(By.linkText("Log in")).click();
		dr.findElement(By.id("Email")).sendKeys("kumartharun123@gmail.com");
	    dr.findElement(By.name("Password")).sendKeys("smarts");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		ScreenShot();

}
}