package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLogin {
	static WebDriver dr;
	static String n,p,a,b,s1;
	
	static void login() {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	dr=new ChromeDriver();
	dr.get("https://www.saucedemo.com/");
	//dr.findElement(By.id("user-name")).click();
	dr.findElement(By.id("user-name")).sendKeys("standard_user");
    dr.findElement(By.id("password")).sendKeys("secret_sauce");
	dr.findElement(By.xpath("//input[@type='submit']")).click();
	/*dr.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/svg/path")).click();*/
	}
	
	static void addproduct(){
		dr.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		n=dr.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/a/div")).getText();
		p=dr.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/div")).getText();
		s1= p.substring(1,6);
		//System.out.println(s1);
		System.out.println(n);
		System.out.println(s1);
	}
	
	static void verify(){
		dr.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		a=dr.findElement(By.xpath("//*[@id='item_4_title_link']/div")).getText();
		b=dr.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
		
		System.out.println(a);
		System.out.println(b);
		if(a.equals(n)&&b.equals(s1))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	SauceLogin.login();
	SauceLogin.addproduct();
	SauceLogin.verify();
}
}