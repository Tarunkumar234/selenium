package Day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;


public class Registration {
	static User readExcel(int index){
		User u = new User();
		File file = new File("C:\\Users\\BLTuser.BLT146\\Desktop\\Book0.xlsx");

		try
		{
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(index);
		XSSFCell columnOne = row.getCell(0);
		XSSFCell columnTwo = row.getCell(1);
		XSSFCell columnThree = row.getCell(2);
		XSSFCell columnFour = row.getCell(3);
		XSSFCell columnFive= row.getCell(4);
		XSSFCell columnSix= row.getCell(5);
		u.Gender = columnOne.getStringCellValue();
		u.FirstName = columnTwo.getStringCellValue();
		u.LastName = columnThree.getStringCellValue();
		u.EmailID = columnFour.getStringCellValue();
		u.Password = columnFive.getStringCellValue();
		u.ex_res = columnSix.getStringCellValue();
		        }
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		return u;
		}


		public static String Register(User u)
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		        dr.get("http://demowebshop.tricentis.com/");
		        dr.findElement(By.xpath("//a[@class='ico-register']")).click();
		        java.util.List<WebElement> rb= dr.findElements(By.name("Gender"));
		        if((u.Gender).equals("Male"))
		        {
		        ((WebElement) rb.get(0)).click();
		        }
		        else
		        {
		        ((WebElement) rb.get(1)).click();
		        }
		       
		        dr.findElement(By.name("FirstName")).sendKeys(u.FirstName);
		        dr.findElement(By.name("LastName")).sendKeys(u.LastName);
		        dr.findElement(By.name("Email")).sendKeys(u.EmailID);
		        dr.findElement(By.name("Password")).sendKeys(u.Password);
		        dr.findElement(By.name("ConfirmPassword")).sendKeys(u.Password);
		        dr.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
		        String ar=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		        return ar;
		}


		static void write_excel(int r,String ar,String tr)
		     {
		   
		  File f = new File("C:\\Users\\BLTuser.BLT147\\Desktop\\New folder\\3.xlsx");
		    try
		    {
		    FileInputStream fis=new FileInputStream(f);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet2");
		XSSFRow row=sh.getRow(r);
		XSSFCell cell=row.createCell(6);
		   cell.setCellValue(ar);
		  XSSFCell cell1=row.createCell(7);
		   cell1.setCellValue(tr);
		       FileOutputStream fos=new FileOutputStream(f);
		        wb.write(fos);
		    }
		    catch(FileNotFoundException e)
		  {
		  e.printStackTrace();
		  }
		  catch(IOException e)
		  {
		  e.printStackTrace();
		  }
		     }


		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Test_res;
		for(int i=1;i<5;i++)
		{
		           User us=readExcel(i);
		          System.out.println(us.Gender + "\t" + us.FirstName + "\t" + us.LastName + "\t" + us.EmailID + "\t" + us.Password);
		           String ac_res=Register(us);
		           if((us.ex_res).equals(ac_res))
		          {
		                   System.out.println("Pass");
		                   Test_res="PASS";
		          }
		           else
		           {
		          System.out.println("fail");
		          Test_res="FAIL";
		           }
		           write_excel(i,ac_res,Test_res);
		           
		}
		}}