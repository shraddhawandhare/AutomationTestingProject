/**
 * 
 */
package com.automationtesting;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ASUS
 *
 */
public class TestClass {
	
	@Test
	public void testMethod(){
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		WebDriverManager.iedriver().version("3.14.0").arch32().setup();
		WebDriver driver=new InternetExplorerDriver();
		//for firefox-52
//		WebDriverManager.firefoxdriver().version("v0.18.0").arch32().setup();
//		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.vtiger.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
		
	}

}
