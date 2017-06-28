package com.demoqa.testclass;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.util.Baseclass;
import com.demoqa.util.Loadplaceholder;


public class Common_test extends Baseclass {
	WebDriver driver = null; 
	Common_method common=null;
	Actions action=null;
	
	@BeforeClass
	public void selectbrower() {
		driver=getDriver();
		common=new Common_method(driver);
		
	}
	
	
	//Mouse hover header tabs
	@Test
	public void taboverlapping() throws InterruptedException {
		action=new Actions(driver);
		
		Thread.sleep(3000);
		action.moveToElement(common.hometab).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Mousehover and on home tab");
		
		action.moveToElement(common.aboutus).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Mousehover and on about us tab");
	
		action.moveToElement(common.services).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Mousehover and on services tab");
		
		action.moveToElement(common.demo).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Mousehover and on demo tab");
		
		action.moveToElement(common.blog).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Mousehover and on blog tab");
		
		action.moveToElement(common.contactus).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Mousehover and on contact us tab");
		Reporter.log("All header tabs clicked");
	}
}
