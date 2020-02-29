package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		
		dr.findElement(By.xpath("//a[@href='/login']")).click();
		/*dr.findElement(By.id("Email")).sendKeys("kumartharun123@gmail.com");
	    dr.findElement(By.name("Password")).sendKeys("smarts");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();*/
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).isSelected();


	}

}
