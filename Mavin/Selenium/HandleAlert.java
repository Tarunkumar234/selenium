package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("gddsg");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		Alert a=dr.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		
	}
		Alert a1=dr.switchTo().alert();
		s=a1.getText();
		a1.accept();
		System.out.println(s);
	}
}
