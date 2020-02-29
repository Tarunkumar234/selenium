package Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getexcel {
	public String read_excel(String filename,String sheetname,int r,int c)
	{
		String s=null;
		File f=new File(filename);
		try {
			FileInputStream fis=new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFRow row=sh.getRow(0);
			XSSFCell cell=row.getCell(0);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\BLTuser.BLT146\\Desktop\\1.xlsx";
		String sheetname = "Sheet1";
		int r=0; int c=0;
		
		getexcel excel=new getexcel();
		String s=excel.read_excel(filename,sheetname,r,c);
		System.out.println(s);
		
		

	}

}
