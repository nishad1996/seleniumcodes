package synchronisationimplicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumValidation {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//define implicit wait for browser
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
		//identify username field
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
		
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
		
		//identify passwrod field 
		
		WebElement password =driver.findElement(By.name("pwd"));
		System.out.println("passwrod is displayd or not ?:" +password.isDisplayed());
		System.out.println("passwrod is functional or not ?" +password.isEnabled());
		
		password.clear();
		password.sendKeys("manager");
		
		String defaultvalueofpassword = password.getAttribute("placeholder");
		System.out.println("default value of passwrod is :" +defaultvalueofpassword);
		System.out.println(":" +defaultvalueofpassword.equals("Password"));
		
		
		//identify keepLoggedInLabel 
		WebElement keepLoggedInLabelCheckBoxText=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		String checkBoxTextName=keepLoggedInLabelCheckBoxText.getText();
		System.out.println(checkBoxTextName);
		
		
		//login button
		
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		System.out.println("is displayed "+loginbutton.isDisplayed());
		System.out.println("is enebaled:" +loginbutton.isEnabled());
		String gettext =loginbutton.getText();
		System.out.println(gettext);
		
		loginbutton.click();
		//Thread.sleep(2000);
		
		String homepageactualtitle = driver.getTitle();
		System.out.println("home page title is :" +homepageactualtitle);
		System.out.println("validation by comapring home page tilte :" +homepageactualtitle.equals("actiTIME - Enter Time-Track"));
		
	
		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();
		
		
	}

}