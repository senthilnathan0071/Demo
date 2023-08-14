package com.step;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.base.Base_1;
import org.openqa.selenium.WebDriver;
import org.pom.Demo_Pom;
import org.pom.Pom_1;


import com.runner.Runner_1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition_1 extends Base_1 {
	public static WebDriver driver =Runner_1.driver;
	public static Pom_1 l =new Pom_1(driver);
public static Demo_Pom s =new Demo_Pom(driver);

	@Given("To enter the URL")
	public void to_enter_the_url() {
		url(driver, "https://www.opencart.com/");                                 
	}
	@Given("To Maximize the Window")
	public void to_maximize_the_window() {
		maxi(driver);
	}
	@When("To Click the Features functionality")
	public void to_click_the_features_functionality() throws IOException {
		click(l.getFeatures());
		screenshot(driver, "pic1");
		
	}
	
	
	@When("Scroll down & to click unlimited Everything")
	public void scroll_down_to_click_unlimited_everything() throws IOException {
		scrolldown(driver, l.getUnlimited());
		click(l.getUnlimited());
		screenshot(driver, "pic2");
		
	}
	@When("Scroll up & To click Customer")
	public void scroll_up_to_click_customer() throws IOException {
		scrollup(driver, l.getCustomer());
		click(l.getCustomer());
		screenshot(driver, "pic3");
		
	}
	@When("Scroll down & To click Shipping,Payments and Reports")
	public void scroll_down_to_click_shipping_payments_and_reports() throws IOException {
		scrolldown(driver, l.getShipping());
		click(l.getShipping());
		screenshot(driver, "pic4");
		
		
		
	}
	
	@When("Scroll up & To click Extensions")
	public void scroll_up_to_click_extensions() throws IOException {
		scrollup(driver, l.getExtensions());
		click(l.getExtensions());
		screenshot(driver, "pic5");
		
	}
	@When("Scroll down & To click Mobile&Seo")
	public void scroll_down_to_click_mobile_seo() throws IOException {
		scrolldown(driver, l.getMobile());
		click(l.getMobile());
		screenshot(driver, "pic6");
		
	}
	@Then("Scroll up & Click developer")
	public void scroll_up_click_developer() throws IOException, InterruptedException {
		scrollup(driver, l.getDeveloper());
		click(  l.getDeveloper());
		screenshot(driver, "pic7");
		scrolldown(driver, l.getS());
	}
		@When("to click the facebook icon")
		public void to_click_the_facebook_icon() throws InterruptedException, IOException {
		
		click(l.getS());
		Thread.sleep(1000);
		screenshot(driver, "pic8");
		}
		@When("back to home page")
		public void back_to_home_page() {
		
		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		String parent = b.next();
        String child = b.next();
       
        driver.switchTo().window(child);
        driver.close();
        driver.switchTo().window(parent);
        scrollup(driver, l.getUnlimited());
        
		}
		
//@Tag2		
		@When("Click demo page")
		public void click_demo_page() {
			click(s.getDemo());
			}
		@When("To click the Store Front")
		public void to_click_the_store_front() {
			click(s.getStore());
			
		}
		@When("To click the Desktops")
		public void to_click_the_desktops() throws InterruptedException {
			Set<String> ji =driver.getWindowHandles();
			Iterator<String> ite =ji.iterator();
			String parent =ite.next();
			String child =ite.next();
			driver.switchTo().window(child);
			s.getDesktops().click();
			Thread.sleep(3000);
		}
		@When("To click the dropdown Mac")
		public void to_click_the_dropdown_mac() {
			click(s.getMac());
		}
		@When("To click add to cart")
		public void to_click_add_to_cart() {
			click(s.getAdd_Cart());
			
		}
	
		@When("To click the items")
		public void to_click_the_items() throws IOException {
			click(s.getItems());
			screenshot(driver, "no item selected");
		}
		@When("To click the laptops &Notebooks")
		public void to_click_the_laptops_notebooks() throws IOException {
			click(s.getLaptops());
			screenshot(driver, "No laptops");
		}
		@When("To click the Components")
		public void to_click_the_components() {
			click(s.getComponents());
		}
		@When("To click the Monitors")
		public void to_click_the_monitors() {
			click(s.getMonitors());
			
		}
		@When("To click the Apple add to cart")
		public void to_click_the_apple_add_to_cart() throws InterruptedException {
			click(s.getApple_Cart());
			
			Thread.sleep(2000);
			//movetoelement(s.getMove(), driver);
			
			scrolldown(driver, s.getMove());
			

		}
		@When("To check the Radio button")
		public void to_check_the_radio_button() throws InterruptedException {
			Thread.sleep(3000);
			click(s.getRadio());
		}
		@When("To check the CheckBox")
		public void to_check_the_check_box() {
			click(s.getCheckbox());
		}
		@When("To type the input")
		public void to_type_the_input() {
			s.getInput_option().clear();
			s.getInput_option().sendKeys("Nothing");
		}
		@When("To select the colour")
		public void to_select_the_colour() {
			click(s.getGreen());
		}
		@When("To type the text_area")
		public void to_type_the_text_area() {
			s.getText().sendKeys("Nothing is better than something");
		}
		@When("To enter the quantity")
		public void to_enter_the_quantity() throws IOException {
			s.getQuantity().clear();
			s.getQuantity().sendKeys("5");
			screenshot(driver, "pic9");
			
		}
		
		

		@When("To click the Tablets")
		public void to_click_the_tablets() throws InterruptedException {
			scrollup(driver, s.getTablets());
			Thread.sleep(1000);
			
			s.getTablets().click();
		}



		@When("To select the sort")
		public void to_select_the_sort() throws IOException {
			s.getSort().click();
			screenshot(driver, "pic10");
		}
		@When("To select the show")
		public void to_select_the_show() {
			s.getShow().click();;
		}
		@When("To click the phones")
		public void to_click_the_phones() {
			s.getPhones().click();
		}
		
		@When("To click the htc")
		public void to_click_the_htc() {
			s.getHtc().click();
		}
		@When("To click the cameras")
		public void to_click_the_cameras() {
			s.getCameras().click();
		}
		@When("To click the canon")
		public void to_click_the_canon() {
			s.getCanon().click();
		}
		@When("To click the mp3")
		public void to_click_the_mp3() throws Exception {
			s.getMp3().click();
			screenshot(driver, "pic11");
		}


		
		








}
