package com.demoqa.testclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Datepicker;
import com.demoqa.util.Baseclass;

public class Datepicker_Test extends Baseclass{
	WebDriver driver=null;
	Common_method common=null;
	Datepicker datepic=null;
	
	@BeforeClass
	private void webdriver_setup() {
		driver=getDriver();
		datepic=new Datepicker(driver);
		common=new Common_method(driver);
	}
	
	//Selecting date
	@Test(priority=0)
	private void default_functionality() throws InterruptedException {
		common.datepicker.click();
		Thread.sleep(5000);
		if (datepic.frame1.isDisplayed()) {
			datepic.datepicker.click();
			Thread.sleep(5000);
			System.out.println("Date picker clicked");
			List<WebElement> allDates=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table//td"));
			
			for(WebElement ele:allDates)
			{
				Thread.sleep(2000);
				String date=ele.getText();
				Thread.sleep(2000);
				if(date.equalsIgnoreCase("1"))
				{
					ele.click();
					System.out.println("Date selected ");
					break;
				
				}
				
			}
			
			
		} else {
			System.out.println("Frame is not available");
		}
	}
}
