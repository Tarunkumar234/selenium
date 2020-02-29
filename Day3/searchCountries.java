package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchCountries {

		static WebDriver dr;
		@SuppressWarnings("unused")
		static void search(String s)
		{
		dr.get("https://www.w3schools.com/css/css_table.asp");
		String xp;
		int i=0,j=0,r,c;
		for(r=2;r<=9;r++)
		       {
		        for(c=3;c<=3;c++)
		        {
		        xp="//*[@id=\'customers\']/tbody/tr[" +r+ "]/td[" +c+ "]";
		           String s1 = dr.findElement(By.xpath(xp)).getText();
		        if(s1.equals(s))
		        i=r;
		           j=c;
		           break;
		        }
		        if(i>0&&j>0)
		        break;
		        }
		        for(r=i;r<=i;r++)
		        {
		        for(c=1;c<=j;c++)
		        {
		        xp="//*[@id=\"customers\"]/tbody/tr[" +r+ "]/td[" +c+ "]";
		                String x=dr.findElement(By.xpath(xp)).getText();
		                System.out.print(x + "\t");
		        }
		        System.out.println();
		        }
		        
		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		dr=new ChromeDriver();
		        dr.get("https://www.w3schools.com/css/css_table.asp");
		String[] sStr={"Sweden","UK","Italy"};
		for(int i=0;i<3;i++)
		{
		search(sStr[i]);
		}
		dr.close();


		}

	}


