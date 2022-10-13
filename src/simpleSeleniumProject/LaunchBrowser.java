package simpleSeleniumProject;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class LaunchBrowser {
  public static void main(String[] args) throws IOException  {
	 System.setProperty("webdriver.chrome.driver","D:\\EclipseWoksapce\\seleniumProject\\ChromeDriver_105.0.5195.52.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in//");
	 driver.manage().window().maximize();	
	 
 
	 // WebDriver driver = new HtmlUnitDriver();
      
	     // Navigate to Google		
      driver.get("http://www.google.com");					

		 // Locate the searchbox using its name		
      WebElement element = driver.findElement(By.name("q"));	
      
     // Enter a search query		
     element.sendKeys("Guru99");	
    
     // Submit the query. Webdriver searches for the form using the text input element automatically		
     // No need to locate/find the submit button		
     element.submit();			
     
		// This code will print the page title		
     System.out.println("Page title is: " + driver.getTitle());
  }
  
}
