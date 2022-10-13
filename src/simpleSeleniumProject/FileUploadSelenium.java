package simpleSeleniumProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\EclipseWoksapce\\seleniumProject\\ChromeDriver_104.0.5112.79.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/");
		 driver.get("https://the-internet.herokuapp.com/dropdown");
		 driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.id("dropdown"));
		 Select sl=new Select(ele);
		 
		 sl.selectByVisibleText("Option 1");
       
        
       
		
	}
}
