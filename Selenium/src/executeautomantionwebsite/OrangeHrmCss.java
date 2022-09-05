package executeautomantionwebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmCss {


			public static void main(String[] args) {
				String chromepath = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",chromepath);
				WebDriver driver = new ChromeDriver();
				driver.get("https://demosite.executeautomation.com/");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

				WebElement username=driver.findElement(By.name("UserName"));
				username.clear();
				username.sendKeys("execution");
				

				WebElement pwd=driver.findElement(By.name("Password"));
				pwd.clear();
				pwd.sendKeys("admin");
				
				WebElement login=driver.findElement(By.cssSelector("html>body>form>p:nth-of-type(3)>input"));
				login.click();
				
				WebElement logout=driver.findElement(By.cssSelector("html>body>div>ul>li>a"));
				logout.click();
				
				
			}

		}

	
