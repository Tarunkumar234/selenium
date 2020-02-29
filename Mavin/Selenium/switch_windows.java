package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://www.naukri.com/");
		String main_win_hnd=dr.getWindowHandle();
		for(String handle:dr.getWindowHandles())
		{
			dr.switchTo().window(handle);
			System.out.println("handle="+handle+"Title="+dr.getTitle());
		}

	}

}
