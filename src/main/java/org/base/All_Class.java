package org.base;
import java.awt.AWTException;
import java.awt.Robot;
	import java.awt.event.InputEvent;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.io.Files;
	
public class All_Class {
	
	
	
		
			
		//url
			public static void url(WebDriver driver,String s) {
				driver.get(s);
			}
			
		//maximize
			public static void maxi(WebDriver driver) {
			driver.manage().window().maximize();
			}
			
		//User
			public static void user(WebElement a , String s) {
			a.sendKeys(s);
			}
			
		//Pass
			public static void pass (WebElement a, String b) {
			a.sendKeys(b);
			}
			
		//Click
			public static void click (WebElement a) {
				a.click();
			}
			
		//Close
			public static void close(WebDriver driver) {
				driver.close();
			}
			
		//Title
			public static void title (WebDriver driver) {
				String title = driver.getTitle();
				System.out.println(title);
			}
			
		//Geturl
			public static void geturl (WebDriver driver) {
				String currenturl = driver.getCurrentUrl();
				System.out.println(currenturl);
			}
			
		//PageSource
			public static void pageSource (WebDriver driver) {
				String pagesource = driver.getPageSource();
				System.out.println(pagesource);
			}
			
		//SwitchTo
			public static void switchto(WebDriver driver) {
				driver.switchTo();
			}

		//MoveToElement
			
			public static void movetoelement(WebElement a, WebDriver b) {
				Actions ac=new Actions(b);
				ac.moveToElement(a).build().perform();
			}
			
			
		//implicitlyWait:-

			public static void toHold(WebDriver driver, int i) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
			}

		//Quit:-

			public static void quit(WebDriver a){
			a.quit();
			}

		//Navigate:-

			public static void navigate(WebDriver a){
			a.navigate();
			}

		//Clear:-

			public static void clear(WebElement a){
			a.clear();
			}

		//Submit:-

			public static void submit(WebElement a){
			a.submit();
			}

		//Getattripute:-

			public static void getattripute(WebElement a){
			a.getAttribute(" ");
			}

		//Enterkey:-

			public static void enterkey(WebElement a){
			a.sendKeys(Keys.ENTER);
			}

		//Size:-

			public static void size(WebElement a){
			org.openqa.selenium.Dimension size= a.getSize();
			System.out.println(size);
			}

		//boolean
			
			public static boolean isdisply(WebElement a) {
				boolean displayed = a.isDisplayed();
				return displayed;
			}
			
		//DropDown_value
			
			public static void DropDown_value(WebElement a, String b) {
				Select s =new Select(a);
				s.selectByValue(b);
			}

		//DropDown_Visible
			
			public static void DropDown_visibletxt(WebElement a, String b) {
				Select s= new Select(a);
				s.selectByVisibleText(b);	
			}
			
		//DropDown_index
			
			public static void DropDown_index(WebElement a, int i) {
				Select s=new Select(a);
				s.selectByIndex(i);
			}
			
		//DragAndDrop
			
			public static void DragAndDrop(WebDriver a, WebElement b, WebElement c) {
				Actions ac = new Actions(a);
				ac.dragAndDrop(b, c).perform();
			}

		//screenshot
			public static void screenshot(WebDriver a, String b) throws IOException {
				TakesScreenshot ts= (TakesScreenshot)a;
				File sr = ts.getScreenshotAs(OutputType.FILE);
				Files.copy(sr,new File(b));
			}
			
		//Keypress
			
			public static void keypress() throws AWTException {
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
			}
			
		//Mousepress
			
			public static void mousepress() throws AWTException {
			Robot r =new Robot();
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			}
			
		//Alert_Accept
			
			public static void alert_accept(WebDriver a) {
				a.switchTo().alert().accept();
			}

		//Alert_Dismiss
			
				public static void alert_cancel(WebDriver a) {
					a.switchTo().alert().dismiss();
		}

	//Windowhandle
				
				public static void getWindowHandle(WebDriver driver) {
					String parentid = driver.getWindowHandle();
					System.out.println(parentid);

				}

				public static void getwindowhandles(WebDriver driver) {
					Set<String> allWindowId = driver.getWindowHandles();
					System.out.println(allWindowId);
				}

				public static void toScrollUp(WebDriver driver,WebElement ref) {
					JavascriptExecutor	js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(false)", ref);

				}

				public static void toScrollDown(WebDriver driver,WebElement ref) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true)", ref);

				}

	}



