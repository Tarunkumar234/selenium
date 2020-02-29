package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_tableData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("https://www.w3schools.com/html/html_tables.asp");
        
        String xp;
        
        for(int i=2;i<=7;i++){
        	for(int j=1;j<=3;j++){
        		xp="//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]";
        		String s1=dr.findElement(By.xpath(xp)).getText();
        		System.out.print(s1+"  ");
        	}
        System.out.println();
        }
	}

}
