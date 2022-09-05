package synchronisationimplicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigersyncwait {

	public static void main(String[] args) {
		String Chromepath = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		WebElement signin = driver.findElement(By.cssSelector("html>body>div#page>div:nth-of-type(3)>div:nth-of-type(1)>div>#loginFormDiv>form>div:nth-of-type(3)>button"));
		signin.click();
		
		WebElement profile = driver.findElement(By.cssSelector("html>body>div#page>nav>div>div>div#navbar>ul>li.dropdown>div>a"));
		profile.click();
		
		WebElement logout = driver.findElement(By.cssSelector("html>body>div>nav>div>div>div#navbar>ul>li.dropdown>div>div>div#logout-footer>div>span.pull-right>a"));
		logout.click();
		
		
	}

}
