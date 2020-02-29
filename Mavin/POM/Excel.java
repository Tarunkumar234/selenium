package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public String readexcel(String gender,String firstname,String lastname,String email,String password)
	{
		String s=null;
		File f=new File(filename);
		try {
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet(sheetname);
			XSSFRow row=sh.getRow(1);
			XSSFCell cell=row.getCell(0);
			/*XSSFCell cell1=row.getCell(1);
			XSSFCell cell2=row.getCell(2);
			XSSFCell cell3=row.getCell(3);
			XSSFCell cell4=row.getCell(4);*/
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


}
