package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_1 {
	
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")
	private WebElement Features;

	@FindBy(xpath = "//*[@id=\"tab-admin\"]/div[5]/a")
	private WebElement Unlimited;

	@FindBy(xpath = "//*[@id=\"cms-feature\"]/div[2]/ul/li[3]/a")
	private WebElement Customer;

	@FindBy(xpath = "//*[@id=\"tab-customer\"]/div[5]/a")
	private WebElement Shipping;
	@FindBy(xpath = "//*[@id=\"cms-feature\"]/div[2]/ul/li[5]/a")
	private WebElement Extensions;
	@FindBy(xpath = "//*[@id=\"tab-extension\"]/div[5]/a")
	private WebElement Mobile;
	@FindBy(xpath = "//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a")
	private WebElement Developer;
	@FindBy(xpath="//*[@id=\"tab-developer\"]/div[3]/div/div[2]/h2")
	private WebElement Screenshot;
	@FindBy(xpath = "//*[@id=\"cms-feature\"]/div[1]/div/h1")
	private WebElement scroll_up;
	@FindBy(xpath = "//*[@id=\"tab-admin\"]/div[4]/div/div/div[1]/h3")
	private WebElement scroll_down;
	
	@FindBy(xpath = "(//a[text()='Facebook'])[1]")
	private WebElement f;
		
	
	
	
	
	
	
	

	public WebElement getS() {
		return f;
	}

	public WebDriver getDriver() {
		return driver;
	} 

	public WebElement getScroll_up() {
		return scroll_up;
	}

	public WebElement getScroll_down() {
		return scroll_down;
	}

	public Pom_1(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFeatures() {
		return Features;
	}
	public WebElement getUnlimited() {
		return Unlimited;
	}
	public WebElement getCustomer() {
		return Customer;
	}
	public WebElement getShipping() {
		return Shipping;
	}
	public WebElement getExtensions() {
		return Extensions;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getDeveloper() {
		return Developer;
	}
	public WebElement getScreenshot() {
		return Screenshot;
	}



}
