package assesment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
		        dr.get("http://demowebshop.tricentis.com/login");
		        
		       /* dr.findElement(By.xpath("//div[@class='form-fields']"));
		        dr.findElement(By.xpath("//div[@class='form-fields']//child::div"));*/
		        
		        
		        
		        dr.findElement(By.xpath("//div[@class='form-fields']//child::div[2]//child::input"));
		        dr.findElement(By.xpath("//div[3][@class='inputs']//child::input"));
		        dr.findElement(By.xpath("//div[5][@class='buttons']//child::input"));

	}

}
