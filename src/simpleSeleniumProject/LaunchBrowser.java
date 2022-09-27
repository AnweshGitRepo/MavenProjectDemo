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
	  System.setProperty("webdriver.chrome.driver","D:\\EclipseWoksapce\\seleniumProject\\ChromeDriver_104.0.5112.79.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/html_links.asp");
	    driver.manage().window().maximize();
	  
	List<WebElement> ele= driver.findElements(By.tagName("a"));
	  
	  for(int i=0;i<=ele.size();i++) {

	
		String ss=  ele.get(i).getText();
		if (ele.get(i).getText().contains("Play Game")) {
			ele.get(i).click();
		}
	//	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotBase64, new File("D:\\abc.png"));
		
		
		
		
		System.out.println(ss);	 
	  }
		
	  
	  
 
 
 
  }
  }
 
