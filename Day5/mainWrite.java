package Day5;

public class mainWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\BLTuser.BLT146\\Desktop\\1.xlsx";
		String sheetname = "Sheet2";
		int r=0; int c=0;
		
		writeExcel1 excel=new writeExcel1();
		
		c=2;
		excel.writeexcel(filename,sheetname,r,c,"Tarun");
		

	}

}
