package assignmentday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		String chromepath = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement pswd=driver.findElement(By.name("pwd"));
		pswd.clear();
		pswd.sendKeys("manager");
		
		WebElement click=driver.findElement(By.id("loginButton"));
		click.click();
	}

}
