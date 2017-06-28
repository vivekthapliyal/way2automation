package com.demoqa.util;

import java.util.Map;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.xml.dom.ParentSetter;

public class Baseclass {
	Map<String, String> mp=Loadplaceholder.getproperties();
	
	WebDriver driver=null;
	WebDriverWait wait=null;
	DesiredCapabilities cap=null;
	static String driverPath = "./driver/chromedriver.exe";
	
	public WebDriver getDriver() {
		return driver;
	}
	
	private void setDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(mp.get("baseurl"));
			break;
		case "firefox":
			driver = initFirefoxDriver(mp.get("baseurl"));
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(mp.get("baseurl"));
		}
	}
	
	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	
	
//	public void setDriver(String browser) {
//		cap=new DesiredCapabilities();
//		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//		cap.setCapability(CapabilityType.PLATFORM,Platform.LINUX);
//		cap.setPlatform(Platform.LINUX);
//		
//		if(browser.equalsIgnoreCase("ff")){
//			driver=new FirefoxDriver(cap);
//		}
//		else if (browser.equalsIgnoreCase("CH")) {
//			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//			driver=new ChromeDriver(cap);
//		}	
//		else if (browser.equalsIgnoreCase("IE")) {
//			System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
//			driver=new InternetExplorerDriver(cap);
//		}
//		else {
//			System.out.println("Mention proper browser name");
//		}
//		wait=new WebDriverWait(driver, 20);
//		driver.get(mp.get("baseURL"));
//		driver.manage().window().maximize();
//	}
//	
	
	@Parameters({ "browserType"})
	@BeforeClass
	public void initializeTestBaseSetup(String browserType) {
		try {
			setDriver(browserType);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("----------------------------------------------------------------------------------------");
		driver.close();

	}
	
	@AfterTest
	public void after_test() {
		driver.quit();

	}
	
}
