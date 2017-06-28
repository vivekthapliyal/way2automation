package com.demoqa.testclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Droppable;
import com.demoqa.util.Baseclass;

public class Droppable_Test extends Baseclass {
	WebDriver driver=null;
	Droppable droppable=null;
	Common_method common=null;
	Actions action=null;
	
	@BeforeClass
	public void driversetup() {
		driver=getDriver();
		droppable=new Droppable(driver);
		common=new Common_method(driver);

	}
	
	//Refirecting page and checking page title 
	@Test(priority=0)
	public void droppable_page_redirect() throws InterruptedException {
		common.droppable.click();
		Thread.sleep(5000);
		if (droppable.droppabletitle.getText().contains("Droppable")) {
			System.out.println("User redirected to Droppable page");
		}
		else {
			System.out.println("User is not in correct page");
			driver.quit();
		}
		
	}
	
	// Dropping element
	@Test(priority=1)
	public void default_functionality() {
		if (droppable.frame1.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDrop(droppable.default_source, droppable.default_target).perform();;
			System.out.println("Item is droppable");
		}
		else {
			System.out.println("Frame is not available");
		}

	}
	
	// accepting drag and drop
	@Test(priority=2)
	public void accept() throws InterruptedException {
		droppable.acceptbutton.click();
		Thread.sleep(5000);
		if(droppable.frame2.isDisplayed()){
			action=new Actions(driver);
			Thread.sleep(5000);
			action.dragAndDrop(droppable.draggable_source, droppable.target).build().perform();
			action.dragAndDrop(droppable.drag_drop_source, droppable.target).build().perform();
			System.out.println("Drag and drop is working ");
		}
		else {
			System.out.println("Frame is not abailable");
		}
	}
	//working on shopping cart demo 
	@Test(priority=3)
	public void shoppingcart() throws InterruptedException {
		droppable.shopping_cart_button.click();
		Thread.sleep(5000);
		if (droppable.frame5.isDisplayed()) {
			if (droppable.product_subframe.isDisplayed() && droppable.cartbox.isDisplayed()) {
				droppable.bags_menu.click();
				Thread.sleep(5000);
				System.out.println("Clicked on Bags menu");
				droppable.tshirt_menu.click();
				System.out.println("Clicked on shirt menu");
				Thread.sleep(5000);
				action=new Actions(driver);
				droppable.frame5.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(5000);
				action.dragAndDrop(droppable.bucketshirt, droppable.cartbox).build().perform();
				Thread.sleep(5000);
				System.out.println("Item moved");
				if (droppable.cartbox.getText().contains(droppable.bucketshirt.getText())) {
					System.out.println("Item available into cart");
				} else {
					System.out.println("Item is not available into cart");
				}
				
				
			} else {
				System.out.println("Both Box is not available");
			}
			
		} else {
			System.out.println("Frame is not available");
		}
		
	}
	
	
}
