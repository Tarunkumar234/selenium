package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com/login");
	dr.manage().window().maximize();//max o/p window size

	dr.findElement(By.xpath("//input[@class='email']")).sendKeys("kumartharun123@gmail.com");
    dr.findElement(By.xpath("//input[@class='password']")).sendKeys("smarts");
	dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	dr.findElement(By.linkText("Log out")).click();
	}

}
