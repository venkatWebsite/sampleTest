package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefn {
public static	WebDriver driver;
public static	String browser;
@Parameters({"browser"})
@Test
	public void open_browser_and_launch_google() throws Throwable {
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
	public void type(String search) throws Throwable {
	search="amazon";
driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
Thread.sleep(3000);
	}
@Test
	public void close_the_browser() throws Throwable {
driver.quit();
	}



}
