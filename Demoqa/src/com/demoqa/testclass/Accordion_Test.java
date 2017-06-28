package com.demoqa.testclass;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Accordion;
import com.demoqa.objectclass.Common_method;
import com.demoqa.util.Baseclass;

public class Accordion_Test extends Baseclass {
	Common_method common=null;
	Accordion accord=null;
	Actions action=null;
	WebDriver driver=null;
	
	@BeforeClass
	private void webdriver_setup() {
		driver=getDriver();
		common=new Common_method(driver);
		accord=new Accordion(driver);
	}
	
	
	//Checking page redirection
		@Test(priority=0)
		private void pageredirection() throws InterruptedException {
			common.accordion.click();
			Thread.sleep(5000);
			if (accord.header.getText().contains("Accordion")) {
				System.out.println("Redirected to correct page ");
			} else {
				System.out.println("User is not in corect page");
				driver.close();
			}
		}
		
	// Default functionality 
		@Test(priority=1)
		private void default_functionality() {
			if(accord.frame1.isDisplayed()){
				accord.section1.click();
				accord.section1.sendKeys(Keys.PAGE_DOWN);
				accord.section2_header.click();
				accord.section2.sendKeys(Keys.PAGE_DOWN);
				
			}
			else {
				System.out.println("Frame is not avaliable");
			}

		}
		
}
