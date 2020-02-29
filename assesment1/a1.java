package assesment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
		        dr.get("http://demowebshop.tricentis.com/login");
		        dr.findElement(By.xpath("//label[text()='Email:']"));
		        dr.findElement(By.xpath("//label[text()='Password:']"));
		        dr.findElement(By.xpath("//label[text()='Remember me?']"));

	}

}
