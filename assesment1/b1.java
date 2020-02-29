package assesment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("http://examples.codecharge.com/Store/Default.php");
        String e_title="Online Bookstore";
        System.out.println("Expected result:"+"	"+ e_title);
        String a_title=dr.getTitle();
        System.out.println("Actual Result:"+"	"+a_title);
        if(e_title.equals(a_title))
        	System.out.println("pass");
        else
        	System.out.println("fail");
        WebElement we= dr.findElement(By.name("category_id"));
        Select sel=new Select(we);
        sel.selectByVisibleText("Databases");
        String a= "/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input";
        dr.findElement(By.xpath(a)).click();
        
        dr.findElement(By.xpath("//a[@href='ProductDetail.php?product_id=1']")).click();
        //dr.findElement(By.xpath("//a[@href='ProductDetail.php?product_id=1']")).click();
        dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
        dr.findElement(By.name("quantity")).sendKeys("2");
        dr.findElement(By.xpath("//input[@name='Insert1']")).click();

	}

}
