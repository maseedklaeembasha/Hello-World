import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\Practice\\PracticeExcel.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		
		XSSFWorkbook x=new XSSFWorkbook(fis);
		XSSFSheet sh=x.getSheetAt(0);
		XSSFRow rw=sh.getRow(3);	
		
			XSSFCell cl=rw.getCell(2);
			String value=cl.getStringCellValue();
			System.out.println(value);
		
		x.close();
		
		
	
	
	
		
		
	
		
	
		

	}

}
