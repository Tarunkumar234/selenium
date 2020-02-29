package Day5;

public class mainRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\BLTuser.BLT146\\Desktop\\1.xlsx";
		String sheetname = "Sheet2";
		int r=0; int c=0;
		
		readExcel excel=new readExcel();
		String s=excel.readexcel(filename,sheetname,r,c);
		System.out.println(s);

	}

}
