package POM;

public class TC001 extends BaseClass{
	
	public static void main(String[] args) {
		
		configLoader();
		launch("Chromebrowser");
		getURL("googleurl");
		driver.quit();
	
		launch("IEbrowser");
		getURL("amazonurl");
		driver.quit();
	}
	

}
