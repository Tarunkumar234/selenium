package POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	public static WebDriver driver;
	public void ScreenShot(String string){
		System.out.println("string   value"   +string);
	File ScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	try
	{
		
		String screenshotLocation =string ;
		FileUtils.copyFile(ScreenShot,new File(screenshotLocation));
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

}
}
