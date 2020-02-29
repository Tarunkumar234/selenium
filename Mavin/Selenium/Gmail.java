package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Tarun");
		dr.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		dr.findElement(By.name("Username")).sendKeys("Kumartharun234");
		dr.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("AAA@aa123");
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[3]/div[1]/div[3]/div/div/div[1]/div/div[1]/input")).sendKeys("AAA@aa123");
		dr.findElement(By.xpath("//*[@id='accountDetailsNext']/span/span")).click();  
	   //dr.findElement(By.linkText("Sign in instead")).click();
	}
}
