package assignmentday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		String chromepath = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("admin123");
		
		
		//WebElement Click = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		//Click.click();
	}

}
