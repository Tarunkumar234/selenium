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

	public class PlayWithTableInXl {
		
		
		
		//Read Excel from Sheet 1
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
	p.productQuantity = (int)columnTwo.getNumericCellValue();
	}catch(FileNotFoundException e){
	e.printStackTrace();
	}catch(IOException e){
	e.printStackTrace();
	}
	return p;
	}
	
	
	//Search 
	
	static void searchProduct(int productId, int productQuantity){
	Product product = new Product();
	//product.productID = productId;


	for(int i=1; i<4; i++){
	product = readExcel(i);
	product.productQuantity = productQuantity;
	if(productId == product.productID){
	writeToExcel(product, i-1);
	System.out.println(product.productID + "\t" + product.productName + "\t" + product.productUnitPrice + "\t" + product.productQuantity + "\t"+ (product.productUnitPrice * productQuantity));
	}
	}
	}

	
	//Read from Excel sheet 2
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

	
	
	//WRITE To Excel Sheet 3
	static void writeToExcel(Product product, int index){
	File file = new File("C:\\Users\\BLTuser.BLT146\\Desktop\\Book1.xlsx");

	try{
	FileInputStream fis = new FileInputStream(file);
	@SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet3");
	XSSFRow row = sheet.createRow(index);
	XSSFCell columnOne = row.createCell(0);
	XSSFCell columnTwo = row.createCell(1);
	XSSFCell columnThree = row.createCell(2);
	XSSFCell columnFour = row.createCell(3);

	columnOne.setCellValue(product.productID);
	columnTwo.setCellValue(product.productName);
	columnThree.setCellValue(product.productUnitPrice);
	int total = (product.productUnitPrice * product.productQuantity);
	columnFour.setCellValue(total);


	FileOutputStream fos = new FileOutputStream(file);
	workbook.write(fos);
	}catch(FileNotFoundException e){
	e.printStackTrace();
	}catch(IOException e){
	e.printStackTrace();
	}
	}
	
	

	//Main class
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	for(int i=1; i<3; i++){
	Product pro = readExcelFirstSheet(i);
	searchProduct(pro.productID, pro.productQuantity);
	}
	}
	}


