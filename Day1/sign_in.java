package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com/login");
	dr.findElement(By.id("Email")).sendKeys("kumartharun123@gmail.com");
    dr.findElement(By.name("Password")).sendKeys("smarts");
	dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

}
