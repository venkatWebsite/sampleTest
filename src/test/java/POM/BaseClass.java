package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties p;
	public static String path = "C:\\Users\\USER\\eclipse-workspace\\sampleTest\\src\\test\\java\\POM\\config.properties";
	
	public static void configLoader() {
		
		try {
			FileInputStream fis = new FileInputStream(path);
			p= new Properties();
			p.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	
	public static void launch(String browser) {
		
		if(p.get(browser).equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/USER/.m2/repository/webdriver/chromedriver/win32/76.0.3809.126/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(p.get(browser).equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:/Users/USER/.m2/repository/webdriver/IEDriverServer/Win32/3.150/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Please enter valid browser");
		}

	}
	public static void getURL(String url) {
		driver.get(p.getProperty(url));
	}
	
}
