package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		dr.manage().window().maximize();//max o/p window size
		List<WebElement> rb= dr.findElements(By.name("gender"));
		((WebElement) rb.get(1)).click();
		List<WebElement> rb1= dr.findElements(By.name("ageGroup"));
		((WebElement) rb1.get(2)).click();
		dr.findElement(By.xpath("//button[@onclick='getValues();']")).click();
		
		String xp="/html/body/div[2]/div/div[2]/div[2]/div[2]/p[2]";
		String s=dr.findElement(By.xpath(xp)).getText();
		System.out.println(s);
		
		String a="Sex : Female\nAge group: 15 - 50";
		if(s.equals(a))
			System.out.println("pass");
		else
			System.out.println("Fail");

	}

}
