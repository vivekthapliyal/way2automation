package com.demoqa.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Resizable;
import com.demoqa.util.Baseclass;

public class Resizable_Test extends Baseclass{
	WebDriver driver;
	Common_method common=null;
	Resizable resize=null;
	Actions action=null;
	
	@BeforeClass
	public void setting_driver() {
		driver=getDriver();
		common=new Common_method(driver);
		resize=new Resizable(driver);
	}
	
	//Checking page redirection
	@Test(priority=0)
	private void pageredirection() throws InterruptedException {
		common.resizable.click();
		Thread.sleep(5000);
		if (resize.resizable_header.getText().contains("Resizable")) {
			System.out.println("Redirected to correct page ");
		} else {
			System.out.println("User is not in corect page");
			driver.close();
		}
		
	}
	
	//Default functionality box
	@Test(priority=1,dependsOnMethods="pageredirection")
	private void default_functionality() throws InterruptedException {
		Thread.sleep(3000);
		if (resize.frame1.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDropBy(resize.resizable_element, 200, 200).build().perform();
			Thread.sleep(3000);
			System.out.println("Resizing working fine");
		} else {
			System.out.println("Frame1 is not available");
		}
	}
	
	
	@Test(priority=2)
	private void animate() throws InterruptedException {
		resize.button_animate.click();
		Thread.sleep(2000);
		if (resize.frame2.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDropBy(resize.animate_edge, 200, 200).build().perform();
			Thread.sleep(3000);
			System.out.println("animating is working fine");
		} else {
			System.out.println("Frame2 is not available");
		}

	}
	
	@Test(priority=3)
	private void resize_max() throws InterruptedException {
		resize.button_maxsize.click();
		Thread.sleep(2000);
		if (resize.frame5.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDropBy(resize.resize_max_min, 500, 500).build().perform();
			Thread.sleep(3000);
			action.dragAndDropBy(resize.resize_max_min, 10, 10).build().perform();
			System.out.println("resizing  is working fine");
		} else {
			System.out.println("frame 5 is not available");
		}

	}
	
}
