package sampleTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class java {
Properties properties;
String PropertyPath= "C:\\Users\\USER\\eclipse-workspace\\sampleTest\\property\\prop.properties";
public java() {
BufferedReader reader;
try {
	reader= new BufferedReader(new FileReader(PropertyPath));
	properties = new Properties();
	properties.load(reader);
	reader.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public  String getURL() {
	String url= properties.getProperty("url");
	System.out.println(url.replaceAll(url, "ur"));
	return url;
	
	
}
public static void main(String[] args) {
	java jav= new java();
	jav.getURL();
	
}

}
