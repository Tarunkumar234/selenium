package Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File ("C:\\Users\\BLTuser.BLT146\\Desktop\\1.xlsx");
		FileInputStream fis;
		try{
			fis=new FileInputStream(f);
			@SuppressWarnings("resource")
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFRow row=sh.getRow(0);
			XSSFCell cell=row.getCell(0);
			String s= cell.getStringCellValue();
			System.out.println(s);
			
			cell.setCellValue("chennai");
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			//Re-writting to the cell
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
