package Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel1 {
	public void writeexcel(String filename,String sheetname,int r,int c,String data)
	{
		File f=new File(filename);
		try {
			FileInputStream fis=new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet(sheetname);
			XSSFRow row=sh.getRow(r);
			XSSFCell cell=row.createCell(c);
			
			
			FileOutputStream fos=new FileOutputStream(f);
			cell.setCellValue(data);
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

}
