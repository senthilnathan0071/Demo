package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Pom {
	public WebDriver driver;

	public Demo_Pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[2]/a")
	private WebElement demo;
	@FindBy(xpath = "//a[@href='http://demo.opencart.com/']")
	private WebElement store;
	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/a")
	private WebElement Desktops;

	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a")
	private WebElement Mac;

	@FindBy(xpath = "//*[@id=\"product-list\"]/div/form/div/div[1]/a/img")
	private WebElement Add_Cart;
	

	@FindBy(xpath = "//*[@id=\"header-cart\"]/div/button")
	private WebElement items;

	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[2]/a")
	private WebElement Laptops;
	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[3]/a")
	private WebElement Components;
	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
	private WebElement Monitors;
	@FindBy(xpath = "//*[@id=\"product-list\"]/div[1]/form/div/div[1]/a/img")
	private WebElement Apple_Cart;
	@FindBy(xpath = "//*[@id=\"form-product\"]/h3")
	private WebElement Move;
	

	@FindBy(xpath = "//*[@id=\"input-option-value-7\"]")
	private WebElement Radio;
	
	@FindBy(xpath = "//input[@id='input-option-value-9']")
	private WebElement checkbox;

	@FindBy(xpath = "//input[@id='input-option-208']")
	private WebElement input_option;

	@FindBy(xpath = "//*[@id=\"input-option-217\"]")
	private WebElement Select;
	
	@FindBy(xpath = "//*[@id=\"input-option-217\"]/option[4]")
	private WebElement green;

	@FindBy(xpath = "//textarea[@id='input-option-209']")
	private WebElement Text;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity;
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Tablets']")
	private WebElement tablets;
	@FindBy(xpath = "//*[@id=\"input-sort\"]/option[4]")
	private WebElement sort;
	public WebElement getTablets() {
		return tablets;
	}

	@FindBy(xpath = "//*[@id=\"input-limit\"]/option[3]")
	private WebElement show;
	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[6]/a")
	private WebElement phones;
	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement htc;
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Cameras']") 
	private WebElement cameras;
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canon;
	@FindBy(xpath = "//a[normalize-space()='MP3 Players']")
	private WebElement Mp3;
//	@FindBy(xpath = "")
//	private WebElement
	
	

	public WebElement getQuantity() {
		return quantity;
	}

	public void setQuantity(WebElement quantity) {
		this.quantity = quantity;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDemo() {
		return demo;
	}

	public WebElement getStore() {
		return store;
	}

	public WebElement getDesktops() {
		return Desktops;
	}

	public WebElement getMac() {
		return Mac;
	}

	public WebElement getAdd_Cart() {
		return Add_Cart;
	}

	public WebElement getItems() {
		return items;
	}

	public WebElement getLaptops() {
		return Laptops;
	}

	public WebElement getComponents() {
		return Components;
	}

	public WebElement getMonitors() {
		return Monitors;
	}

	public WebElement getApple_Cart() {
		return Apple_Cart;
	}

	public WebElement getRadio() {
		return Radio;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getInput_option() {
		return input_option;
	}

	public WebElement getSelect() {
		return Select;
	}

	public WebElement getGreen() {
		return green;
	}

	public WebElement getText() {
		return Text;
	}
	public WebElement getMove() {
		return Move;
	}

	public WebElement getSort() {
		return sort;
	}

	public WebElement getShow() {
		return show;
	}

	public WebElement getPhones() {
		return phones;
	}

	public WebElement getHtc() {
		return htc;
	}

	public WebElement getCameras() {
		return cameras;
	}

	public WebElement getCanon() {
		return canon;
	}

	public WebElement getMp3() {
		return Mp3;
	}
	
}
