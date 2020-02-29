package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://jqueryui.com/draggable/");
		dr.switchTo().frame(dr.findElement(By.className("demo-frame")));
		System.out.println(dr.findElement(By.id("draggable")).isDisplayed());
		dr.switchTo().defaultContent();
		dr.findElement(By.linkText("Droppable")).click();

	}

}
