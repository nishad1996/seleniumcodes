package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpebFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\Nisha\\eclipse-workspace\\Selenium\\executable\\geckodriver.exe\\");
	
		FirefoxDriver fdriver = new FirefoxDriver ();
		fdriver.get("Https://www.google.com");
		
	}

}

/*public class nisha{
	 public static void main (String[] args ) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha\\eclipse-workspace\\Selenium\\executable\\chromedriver.exe")
		 	chromedriver ref1 = new chromedriver();
		 ref.get("wwww.google.com");
	 
	 
	 }
} */