package com.demoqa.testclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Menu;
import com.demoqa.util.Baseclass;

public class Menu_Test extends Baseclass{
	WebDriver driver=null;
	Common_method common=null;
	Menu menupage=null;
	Actions action=null;
	@BeforeClass
	private void webdriver_setup() {
		driver=getDriver();
		common=new Common_method(driver);
		menupage=new Menu(driver);
	}
	
	@Test(priority=0)
	public void menu_test() throws InterruptedException {
		common.menu.click();
		Thread.sleep(5000);
		if (menupage.frame1.isDisplayed()) {
			action=new Actions(driver);
			action.moveToElement(menupage.menu_news).moveToElement(menupage.menu_contact).moveToElement(menupage.menu_contact).build().perform();
			System.out.println("Actions performed successfully");
			Thread.sleep(3000);
			action.click(menupage.menu_about).click(menupage.menu_contact).click(menupage.menu_news).build().perform();
			System.out.println("Actions performed successfully");
			
		} else {
			System.out.println("frame is not available");
		}

	}
	//Note : This function is not working
//	@Test(priority=1)
//	private void submenu() throws InterruptedException {
//		
//		Thread.sleep(5000);
//		menupage.submenu_button.click();
//		Thread.sleep(5000);
//		if (menupage.frame2.isDisplayed()) {
//			System.out.println("Frame 2 available");
//
//			Actions builder = new Actions(driver);
//			// Move cursor to the Main Menu Element
//			builder.moveToElement(menupage.about_menu).perform();
//			// Giving 5 Secs for submenu to be displayed
//			Thread.sleep(5000L);
//			
//		
//		} else {
//			System.out.println("Frame 2 is not available");
//		}
//
//	}
	
	
}
