package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature_1\\Open.feature",glue="com.step")
//@CucumberOptions(features="src\\test\\java\\Feature_1\\Open.feature",glue="com.step",dryRun=true,monochrome = false,tags="@Tag2")


public class Runner_1 {
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		ChromeOptions c =new ChromeOptions();
		c.addArguments("--remote-allow-orgins=*");
		driver=new ChromeDriver();
	}
	

}
