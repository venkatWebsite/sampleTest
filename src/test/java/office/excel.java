package office;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	
public static void main(String[] args) {
	

	try {
		fis = new FileInputStream("C:/Users/USER/Desktop/newSheet.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		wb = new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	XSSFSheet sh = wb.getSheetAt(0);
	
	Row row= sh.getRow(0);
	String val =row.getCell(0).getStringCellValue().toString();
	
	System.out.println(val);
	
}

}
