package com.demoqa.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Tabs;
import com.demoqa.util.Baseclass;

public class Tabs_Test extends Baseclass{
	WebDriver driver=null;
	Common_method common=null;
	Tabs tab=null;
	Actions action=null;
	
	@BeforeClass
	private void webdriver_setup() {
		driver=getDriver();
		common=new Common_method(driver);
		tab=new Tabs(driver);
	}
	
	//Checking page redirection
	@Test(priority=0)
	private void page_redirection() throws InterruptedException {
		common.tabs.click();
		Thread.sleep(5000);
		if(tab.tab_header.getText().contains("Tabs")){
			System.out.println("Redirected to correct page");
		}
		else {
			System.out.println("Not in correct page");
		}
	}
	
	//Clicking on tabs
	@Test(priority=1)
	private void tab_clicks() {
		if (tab.frame.isDisplayed()) {
			action=new Actions(driver);
			action.moveToElement(tab.tab2).click().build().perform();
			action.moveToElement(tab.tab3).click().build().perform();;
		} else {

		}	

	}
	
}
