package executeautomantionwebsite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationWebsiteCss {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream ref1 = new FileInputStream(".\\appdata\\websitedata.properties");
		Properties ref2 = new Properties();
		ref2.load(ref1);
		String url=ref2.getProperty("appUrl");
		String Username=ref2.getProperty("Username");
		String Passwd=ref2.getProperty("Passwd");

		String chromepath = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement username=driver.findElement(By.name("UserName"));
		username.clear();
		username.sendKeys(Username);
		

		WebElement pwd=driver.findElement(By.name("Password"));
		pwd.clear();
		pwd.sendKeys(Passwd);
		
		WebElement login=driver.findElement(By.cssSelector("html>body>form>p:nth-of-type(3)>input"));
		login.click();
		Thread.sleep(4000);
		
		WebElement logout=driver.findElement(By.cssSelector("html>body>div>ul>li>a"));
		logout.click();
		
		
	}

}
