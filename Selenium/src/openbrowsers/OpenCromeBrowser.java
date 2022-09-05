package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nisha\\eclipse-workspace\\Selenium\\executable\\chromedriver.exe\\");
	
	ChromeDriver cdriver = new ChromeDriver ();
	// generic way 
	WebDriver cdriver1 = new  ChromeDriver();
	
	cdriver.get("https://www.google.com");
	
	}

}
