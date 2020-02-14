package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		
		//dr.findElement(By.xpath("//a[@id='bd-versions']")).click();
		WebElement we=dr.findElement(By.name("category_id"));
		Select sel=new Select(we);
		sel.selectByVisibleText("Databases");

	}

}
