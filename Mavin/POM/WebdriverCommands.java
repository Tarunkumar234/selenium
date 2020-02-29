package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {
	public static WebDriver driver;
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	public static void function() throws InterruptedException{
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("http://demowebshop.tricentis.com/"))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		String W=driver.findElement(By.id("newsletter-subscribe-block")).getText();
		String A=driver.findElement(By.id("newsletter-email")).getAttribute("type");
		String B=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		
		System.out.println(A);
		System.out.println(W);
		System.out.println(B);
	}
	public static void teardown(){
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException  {
		setup();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		function();
		teardown();
	
	}

}
