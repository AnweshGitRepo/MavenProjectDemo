package simpleSeleniumProject;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectDetails {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\EclipseWoksapce\\seleniumProject\\ChromeDriver_105.0.5195.52.exe");
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
	      Thread.sleep(10000);
	      WebElement SeleniumTooltipelEment = driver.findElement(By.id("gsc-i-id1"));
	      String Tooltiptext=SeleniumTooltipelEment.getAttribute("title");
	      
	      System.out.println("The tooltip Text is: "+Tooltiptext);
	   }
	}
	  
		
	    
	

