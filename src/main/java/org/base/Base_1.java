package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base_1 {
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}

//maximize
	public static void maxi(WebDriver driver) {
		driver.manage().window().maximize();
	}

	// Click
	public static void click(WebElement a) {
		a.click();
	}

	public static void screenshot(WebDriver a, String b) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) a;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File ("C:\\Users\\LENOVO\\eclipse-workspace\\Open_Cart\\Screenshot"+b+".png");
		FileUtils.copyFile(sr, destination);
	}
	//Scrolldown
	
	public static void scrolldown(WebDriver driver,WebElement web) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", web);
		
	}
	
//scrollup
	public static void scrollup(WebDriver driver,WebElement web) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", web);
	}
		//move to elements

		public static void movetoelement(WebElement a, WebDriver b) {
			Actions ac=new Actions(b);
			ac.moveToElement(a).build().perform();
		}
		
	
}
