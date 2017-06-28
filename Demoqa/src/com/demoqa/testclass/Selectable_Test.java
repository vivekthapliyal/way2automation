package com.demoqa.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Selectable;
import com.demoqa.util.Baseclass;

public class Selectable_Test extends Baseclass{
	
	WebDriver driver=null;
	Common_method common=null;
	Selectable selectable=null;
	Actions action=null;
	
	@BeforeClass
	private void webdriversetup() {
		driver=getDriver();
		common=new Common_method(driver);
		selectable=new Selectable(driver);
	}
	
	//Checking page redirection
	@Test(priority=0)
	private void pageredirection() throws InterruptedException {
		common.selectable.click();
		Thread.sleep(5000);
		if (selectable.header.getText().contains("Selectable")) {
			System.out.println("Redirected to correct page ");
		} else {
			System.out.println("User is not in corect page");
			driver.close();
		}
		
	}
	
	
	// Checking default functionality
	@Test(priority=1)
	private void default_functionality() throws InterruptedException {
		if (selectable.frame1.isDisplayed()) {
			Thread.sleep(5000);
			action=new Actions(driver);
			action.click(selectable.item1).click(selectable.item2).click(selectable.item3).click(selectable.item7).build().perform();
			System.out.println("Multiple items clicked");
			Thread.sleep(5000);
		//	action.clickAndHold(selectable.item1).click(selectable.item7).build().perform();
			System.out.println("Selecting working fine");
		}
		else {
			System.out.println("Frame is not avaliable");
		}

	}
	
	//clicking on grid
	@Test(priority=2)
	private void displaygrid() throws InterruptedException {
		selectable.button_grid.click();
		Thread.sleep(3000);
		if (selectable.frame2.isDisplayed()) {
			action=new Actions(driver);
			Thread.sleep(3000);
			action.click(selectable.grid_item1).click(selectable.grid_item3).click(selectable.grid_item5).build().perform();
		}
		else {
			System.out.println("Frame not available");
		}
	}
}
