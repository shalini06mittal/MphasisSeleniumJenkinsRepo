package com.mphasis.demo.SeleniumJenminsDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	private WebDriver driver;
	private String url;
	private String expectedTitle;

	@BeforeMethod
	public void before()
	{
		//System.setProperty("webdriver.chrome.driver", "D://jars/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/jars/chromedriver");
		driver = new ChromeDriver();
		url = "http://www.google.com";
		expectedTitle = "Google";
		driver.navigate().to(url);

	}	
	@Test
	public void shouldTitleMatch()
	{ 	
		String actualtitle = driver.getTitle();
		AssertJUnit.assertEquals(actualtitle, expectedTitle);
	}
	@AfterMethod
	public  void closeBrowser()
	{
		// 4) close the browser
		driver.close();
	}
}
