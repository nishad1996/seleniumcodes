package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidationAss {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" ,driverpath);
		WebDriver ref1 = new ChromeDriver ();
		
	    ref1.get("https://demo.actitime.com");
		
		String title = ref1.getTitle();
		int length = title.length();
		
		System.out.println("title name :" +title);
		System.out.println("title length :" +length);
		
		String actualurl = ref1.getCurrentUrl();
		String expectedurl = "//demo.actitime.com" ;
		System.out.println("actual result is :" +actualurl.equals(expectedurl));
		
		int codelength= ref1.getPageSource().length();
		System.out.println("length is :" +codelength);
		
		ref1.close();
		
	}

}
