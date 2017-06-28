package com.demoqa.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Slider;
import com.demoqa.util.Baseclass;

public class Slider_Test extends Baseclass {
	WebDriver driver=null;
	Common_method common=null;
	Slider slider=null;
	Actions action=null;
	
	@BeforeClass
	public void webdriver_Setup() {
		driver=getDriver();
		common=new Common_method(driver);
		slider=new Slider(driver);

	}
	
	@Test(priority=0)
	private void page_redirection() throws InterruptedException {
		common.slider.click();
		Thread.sleep(3000);
		if(slider.header.getText().contains("Slider")){
			System.out.println("Redirected to correct page");
		}
		else {
			System.out.println("Not in correct page");
		}
	}
	
	@Test(priority=1)
	private void slider_work() {
		if (slider.frame1.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDropBy(slider.sliderform, 200, 0).build().perform();
			System.out.println("Slider moved");
		} else {
			System.out.println("Frame is not available");
		}
		

	}
	
			
}
