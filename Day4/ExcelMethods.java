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

public class ExcelMethods {
	static File f;
	static String read()
	{
	String s = null;
	try {
	FileInputStream fis=new FileInputStream(f);
	@SuppressWarnings("resource")
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("Sheet2");
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
	static void write(String str)
	{
	try
	{
	FileInputStream fis=new FileInputStream(f);
	@SuppressWarnings("resource")
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("Sheet2");
	XSSFRow row=sh.getRow(0);
	XSSFCell cell=row.getCell(0);

	cell.setCellValue(str);
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
	f=new File("C:\\Users\\BLTuser.BLT146\\Desktop\\1.xlsx");
	write("lohitha,Bhavana,Tarun");
	String s=read();
	System.out.println(s);
	}
	}