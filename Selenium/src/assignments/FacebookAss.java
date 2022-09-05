package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAss {

	public static void main(String[] args) {
		String driver = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver);
		WebDriver ref2 = new ChromeDriver();
		
		ref2.get("https://www.facebook.com");
		
		String actualtitle = ref2.getTitle();
		String expectedtitle = "Facebook – log in or sign up";
		System.out.println("actaul result is : " +actualtitle.equals(expectedtitle));
		System.out.println("actual tiltle is :" +actualtitle);
		
		ref2.close();
		
	}

}
