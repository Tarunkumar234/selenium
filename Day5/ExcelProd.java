package Day5;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/* class Product {
	int productID;
	String productName;
	int productUnitPrice;
}
*/
public class ExcelProd{
	static Product readExcelFirstSheet(int index){
		Product p = new Product();
		File file = new File("C:\\Users\\BLTuser.BLT146\\Desktop\\Book1.xlsx");

		try{
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(index);
		XSSFCell columnOne = row.getCell(0);
		XSSFCell columnTwo = row.getCell(1);
		

		p.productID = (int)columnOne.getNumericCellValue();
		p.productQuantity= (int)columnTwo.getNumericCellValue();

		}catch(FileNotFoundException e){
		e.printStackTrace();
		}catch(IOException e){
		e.printStackTrace();
		}
		return p;
		}


static Product readExcel(int index){
Product p = new Product();
File file = new File("C:\\Users\\BLTuser.BLT146\\Desktop\\Book1.xlsx");

try{
FileInputStream fis = new FileInputStream(file);
@SuppressWarnings("resource")
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheet("Sheet2");
XSSFRow row = sheet.getRow(index);
XSSFCell columnOne = row.getCell(0);
XSSFCell columnTwo = row.getCell(1);
XSSFCell columnThree = row.getCell(2);

p.productID = (int)columnOne.getNumericCellValue();
p.productName = columnTwo.getStringCellValue();
p.productUnitPrice = (int)columnThree.getNumericCellValue();

}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}
return p;
}

static void searchProduct(int productId, int productQuantity){
Product product = new Product();
for(int i=1; i<4; i++){
product = readExcel(i);

if(productId == product.productID){
System.out.println(product.productID + "\t" + product.productName + "\t" + (product.productUnitPrice * productQuantity));
}
}

}


public static void main(String[] args) {
// TODO Auto-generated method stub
for(int i=1;i<3;i++){
	Product a=readExcelFirstSheet(i);
	searchProduct(a.productID,a.productQuantity);
}	
}
}