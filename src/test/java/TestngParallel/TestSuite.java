package TestngParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuite {
public static WebDriver driver;
		@Parameters({"browser"})
@BeforeClass
			public void open_browser_and_launch_google(String browser) throws Throwable {
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
		        driver = new InternetExplorerDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
		        driver = new FirefoxDriver();
			}else {
				System.out.println("browserName is invalid");
			}

				driver.manage().window().maximize();
				driver.get("https://google.com");
			}

		@Test
			public void type() throws Throwable {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("amazon");
		Thread.sleep(3000);
			}
@AfterClass
			public void close_the_browser() throws Throwable {
		driver.quit();
			}


}
