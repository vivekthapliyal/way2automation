package com.demoqa.testclass;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Frames_windows;
import com.demoqa.util.Baseclass;

public class Frames_windows_Test extends Baseclass {
	WebDriver driver=null;
	Common_method common=null;
	Frames_windows frame=null;
	
	@BeforeClass
	private void webdrier_setup() {
		driver=getDriver();	
		common=new Common_method(driver);
		frame=new Frames_windows(driver);
		}
	
	
	//Checking page redirection
	@Test(priority=0)
	private void page_redirection() throws InterruptedException {
		common.frames.click();
		Thread.sleep(5000);
		if (frame.header.getText().contains("Frames and windows")) {
			System.out.println("Redirected to correct page");
			
		} else {
			System.out.println("Not in correct url");
		}

	}
	
	
	@Test(priority=1)
	private void new_window() {
		
			String window1=driver.getWindowHandle();
			frame.new_browser.click();
			Set<String> set=driver.getWindowHandles();
//			System.out.println(set.size());
			set.remove(window1);
			String window2=(String)set.toArray()[0];
			driver.switchTo().window(window2).close();
			System.out.println("New window is working fine");	
			driver.switchTo().window(window1);
		}
	
	//Working on new window
	@Test(priority=2)
	private void seperate_window() throws InterruptedException {
			frame.buttom_seperate_window.click();	
			Thread.sleep(5000);
			if (frame.frame2.isDisplayed()) {
				System.out.println("Frame is available");
				String window1=driver.getWindowHandle();
				frame.newseperate_link.click();
				Set<String> set=driver.getWindowHandles();
				System.out.println(set.size());
				set.remove(window1);
				String window2=(String)set.toArray()[0];
				driver.switchTo().window(window2);
				frame.text_box.sendKeys("Hello");
				frame.text_box.sendKeys(Keys.ENTER);
				driver.switchTo().window(window2).close();
				driver.switchTo().window(window1);
				
				
			}
			else {
				System.out.println("Frame is not available");
			}
	}
	
	//Working on frame 3
	@Test(priority=3)
	private void frame_work() throws InterruptedException {
		frame.button_frameset.click();
		Thread.sleep(5000);
		
		if (frame.frame3.isDisplayed()) {
			String window1=driver.getWindowHandle();
			frame.frameset.click();
			driver.manage().window().maximize();
			Set<String> set=driver.getWindowHandles();
			set.remove(window1);
			String window2=(String)set.toArray()[0];
			Thread.sleep(3000);
			driver.switchTo().window(window2);
			driver.switchTo().frame(frame.topframe);
			System.out.println(frame.upperframecontant.getText());
			Thread.sleep(5000);
			driver.switchTo().window(window2);
			driver.switchTo().frame(frame.bottomframe);
			Thread.sleep(5000);
			System.out.println(frame.lowerframecontent.getText());
			
			driver.switchTo().window(window2).close();
			driver.switchTo().window(window1);
			
			
		} else {
			System.out.println("Frame is not available");
		}

	}

	
}
