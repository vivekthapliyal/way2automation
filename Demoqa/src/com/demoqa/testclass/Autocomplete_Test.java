package com.demoqa.testclass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Autocomplete;
import com.demoqa.objectclass.Common_method;
import com.demoqa.util.Baseclass;

public class Autocomplete_Test extends Baseclass{

	WebDriver driver=null;
	Common_method common=null;
	Autocomplete autocomplete= null;
	
	
	@BeforeClass
	private void webdriversetup() {
		driver=getDriver();
		common=new Common_method(driver);
		autocomplete=new Autocomplete(driver);
	}
	
	
	//Checking page redirection
		@Test(priority=0)
		private void pageredirection() throws InterruptedException {
			common.autocomplete.click();
			Thread.sleep(5000);
			if (autocomplete.header_text.getText().contains("Autocomplete")) {
				System.out.println("Redirected to correct page ");
			} else {
				System.out.println("User is not in corect page");
				driver.close();
			}
		}
		
		//Working on default functionality
		@Test(priority=1)
		private void default_functionality() throws InterruptedException {
			if (autocomplete.frame1.isDisplayed()) {
				Thread.sleep(3000);
				autocomplete.textbox.sendKeys("a");
				Thread.sleep(3000);
				
				List<String> list=(List<String>) driver.findElement(By.tagName("li"));
				System.out.println(list.size());
				
			} else {
				System.out.println("Frame 1 is not available");

			}

		}
	
}
