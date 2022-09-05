package multielementassignement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartMultiElement {

	public static void main(String[] args) throws InterruptedException {
		String chromepath = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver driver=new ChromeDriver();
		
		//maximize window 
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);

		List<WebElement>topffers=driver.findElements(By.cssSelector("html>body>div>div>div:nth-of-type(2)>div>div>div>a>div>div>img"));
		System.out.println("suggetion count:" +topffers.size());
		
		for(int i=0;i<topffers.size();i++) {
			WebElement element=topffers.get(i);
			System.out.println(element.getText());
		
		}
	}

}
