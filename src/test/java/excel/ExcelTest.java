package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
public static void main(String[] args) throws IOException, Exception {
//	DateFormat date= new SimpleDateFormat("dd mm yy");
//	Date d= Date.parse(date);
	Calendar da= Calendar.getInstance();
	//da.setTime(d);
	da.add(Calendar.DAY_OF_WEEK	, -1);
	 SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyy");
	    String result = s.format(new Date(da.getTimeInMillis()));
	
	
	System.out.println(result);
	//System.out.println(d.);
	
	
	File src = new File("C:\\Users\\USER\\Desktop\\Excel\\test"+result+".xls");
	src.createNewFile();
	
	FileInputStream fis = new FileInputStream(src);
	
	HSSFWorkbook wb = new HSSFWorkbook(fis);
//	
//	if(wb.getSheetAt(0).equals("Results")) {
//		System.out.println("Sheet exists");
//	}else {
	
	
	Sheet sh = wb.createSheet("Results");
	//}
	
	//FileOutputStream fos = new File FileOutputStream()
	
}
	
	
}
