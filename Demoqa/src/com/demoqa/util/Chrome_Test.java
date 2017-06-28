package com.demoqa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Chrome_Test {
	WebDriver driver=null;
	
	@Parameters("broswer")
	@Test
	private void browsertest(@Optional("FF") String broswer) {
		
		
		if(broswer.equals("FF")){
			driver=new FirefoxDriver();
			System.out.println(broswer+"selected");
		
		}else if (broswer.equals("CH")) {
	      			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println(broswer+"selected");
		}
	}
}