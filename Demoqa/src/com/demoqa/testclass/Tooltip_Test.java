package com.demoqa.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Tooltip;
import com.demoqa.util.Baseclass;

public class Tooltip_Test extends Baseclass{
	WebDriver driver=null;
	Common_method common=null;
	Tooltip tip=null;
	Actions action=null;
	
	@BeforeClass
	private void webdrier_setup() {
		driver=getDriver();
		common=new Common_method(driver);
		tip=new Tooltip(driver);
	 }
	
	//Checking page redirection
	@Test(priority=0)
	private void page_redirection() throws InterruptedException {
		common.tooltip.click();
		Thread.sleep(5000);
		if (tip.header.getText().contains("Tooltip")) {
			System.out.println("Redirected to correct page");
		} else {
			System.out.println("Not in correct page");
		}

	}
	
	//Getting text
	
	@Test(priority=1)
	private void tooltip_text() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("check 1");
		if (tip.frame1.isDisplayed()) {
			action=new Actions(driver);
			Thread.sleep(5000);
			
			System.out.println("check 2");
			
			tip.age.click();
			
			String tooltip_text=tip.age.getText();
			Thread.sleep(5000);
			System.out.println(tooltip_text);
			
			System.out.println("check 3");
		} 
		else {
			System.out.println("Frame not available");
		}
	}
}
