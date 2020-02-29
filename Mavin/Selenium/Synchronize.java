package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com/");
	dr.manage().window().maximize();
	/*dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);*/
	dr.findElement(By.linkText("Log in")).click();
	WebDriverWait wt=new WebDriverWait(dr,60);
	wt.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));
	dr.findElement(By.id("Email")).sendKeys("kumartharun123@gmail.com");
    dr.findElement(By.name("Password")).sendKeys("smarts");
	dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	

	}

}
