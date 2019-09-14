package excel;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloExcel {
	
	public static void main(String[] args) throws FilloException {
		Fillo fillo =new Fillo();
		Connection conn= fillo.getConnection("C:/Users/USER/Desktop/Book.xlsx");
		String query = "Select * from sheet1";
		Recordset rs= conn.executeQuery(query);
		ArrayList<String> list =new ArrayList<String>();
		while(rs.next()) {
		System.out.println(rs.getField("Name"));
		
		}
		System.out.println(list);
		rs.close();
		conn.close();
	}

}
