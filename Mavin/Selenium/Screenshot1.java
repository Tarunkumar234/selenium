package Selenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot1 {
	static WebDriver dr;
	public static void ScreenShot(String string)
	{
		File ScreenShot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
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
	public static void ScreenShotfull() throws IOException
	{
		Screenshot st=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(dr);
		ImageIO.write(st.getImage(), "jpg", new File("C:\\Users\\BLTuser.BLT146\\Desktop\\New folder(2)\\exceptions1.jpg"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		ScreenShot("C:\\Users\\BLTuser.BLT146\\Desktop\\New folder(2)\\exceptions.png");
		dr.findElement(By.linkText("Log in")).click();
		dr.findElement(By.id("Email")).sendKeys("kumartharun123@gmail.com");
	    dr.findElement(By.name("Password")).sendKeys("smarts");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		ScreenShot("C:\\Users\\BLTuser.BLT146\\Desktop\\New folder(2)\\exceptions1.png");
		ScreenShotfull();
		dr.close();

	}

}
