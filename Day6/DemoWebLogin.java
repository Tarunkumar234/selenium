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
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebLogin {
	public static String readexcel(int r,int c)
	{
		String s=null;
		String sheetname="Sheet1";
		File f=new File("C:\\Users\\BLTuser.BLT146\\Desktop\\Book2.xlsx");
		try {
			FileInputStream fis=new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet(sheetname);
			XSSFRow row=sh.getRow(r);
			XSSFCell cell=row.getCell(c);
			s=cell.getStringCellValue();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return s;
	}

	public static String Login(String email,String password){
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		dr.findElement(By.linkText("Log in")).click();
		dr.findElement(By.id("Email")).sendKeys(email);
		dr.findElement(By.name("Password")).sendKeys(password);
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String ar=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		dr.close();
		return ar;
	}
	
	public static void writeexcel(int r,String ar,String tr)
	{
		File f=new File("C:\\Users\\BLTuser.BLT146\\Desktop\\Book2.xlsx");
		try {
			FileInputStream fis=new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFRow row=sh.getRow(r);
			XSSFCell cell=row.createCell(3);
			cell.setCellValue(ar);
			XSSFCell cell1=row.createCell(4);
	
			cell1.setCellValue(tr);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
		
			}

			catch (FileNotFoundException e) {
			e.printStackTrace();

			}
			catch (IOException e)
			{
			e.printStackTrace();
			}
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test_res;
		for(int i=1; i<=5; i++){
			String e= readexcel(i,0);
			String p= readexcel(i,1);
			String ex_res= readexcel(i,2);
			String ace_result=Login(e,p);
			if(ex_res.equals(ace_result)){
				System.out.println("pass");
				test_res="pass";
			}
				else{
					System.out.println("fail");
				test_res="fail";
			}
			writeexcel(i,ace_result,test_res);

		}

	}}
