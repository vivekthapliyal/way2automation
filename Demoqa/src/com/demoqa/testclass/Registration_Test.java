package com.demoqa.testclass;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Registration_page;
import com.demoqa.util.Baseclass;

public class Registration_Test extends Baseclass{
	WebDriver driver=null;
	Registration_page registration=null;
	Common_method common=null;
	Select select=null;
	
	@BeforeClass
	public void selectbrowser() {
		driver=getDriver();
		registration=new Registration_page(driver);
		common=new Common_method(driver);
		}
	
	//Registration page redirection
	@Test(priority=0)
	public void registration_page() throws InterruptedException {
		common.registratrion.click();
		System.out.println("Clicked on registration button");
		Thread.sleep(5000);
		}
	
	//submitting blank form
	@Test(priority=1)
	public void blank_submit() throws InterruptedException {
		registration.submit.click();
		System.out.println("Submitted blank form");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		Reporter.log("Blank form submitted successfully");
	}
	
	
	//submitting first name 	
	@Test(priority=2)
	public void first_name()  {
		registration.firstname.sendKeys("Vivek");
		System.out.println("First name entered sucessfully");
		Reporter.log("First name entered successfully");
		}
	
	//Entering last name
	@Test(priority=3)
	public void last_name() {
		registration.lastname.sendKeys("Thapliyal");
		Reporter.log("Last name entered successfully");
	}
	
	//Selecting martial status 
	@Test(priority=4)
	public void martial_status() throws InterruptedException {
		registration.maritailstatus_single.click();
		Thread.sleep(2000);
		System.out.println("Clicked on single status");
		
		registration.maritailstatus_married.click();
		Thread.sleep(2000);
		System.out.println("Clicked on married status");
		
		registration.maritailstatus_divorced.click();
		Thread.sleep(2000);
		System.out.println("Clicked on divorced status");
		
		Reporter.log("Martial Status selected successfully");
		
	}
	
	//selection hobby
	@Test(priority=5)
	public void selcting_hobby() throws InterruptedException {
		
		registration.hobby_dance.click();
		Thread.sleep(2000);
		System.out.println("Hobby Dance selected");
		
		registration.hobby_reading.click();
		Thread.sleep(2000);
		System.out.println(" Hobby Reading selected");
		
		registration.hobby_cricket.click();
		Thread.sleep(2000);
		System.out.println("Hobby cricket selected");
		
		
		Reporter.log("Hobby selected successfully");
	}
	
	
	//Selecting country india
	@Test(priority=6)
	public void country_select() throws InterruptedException {
		registration.countary.click();
		
		select=new Select(registration.countary);
		List<WebElement> li=select.getOptions();
		
		for (int i = 0; i <=li.size() ; i++) {
			registration.countary.sendKeys(Keys.DOWN);
		}
		Thread.sleep(2000);
		registration.countary.click();
		select.selectByValue("India");
		Reporter.log("country selected successfully");

	}
	
	//Selecting Date of birth
	@Test(priority=7)
	public void dob_select() {
		Select selectmonth=new Select(registration.dob_month);
		Select selectday=new Select(registration.dob_date);
		Select selectyear=new Select(registration.dob_year);
		
		selectmonth.selectByValue("5");
		selectday.selectByValue("11");
		selectyear.selectByValue("1992");
		Reporter.log("Dob selected successfully");
	
	}
	
	//Enter phone number
	@Test(priority=8)
	public void phone_number() {
		registration.phone_number.sendKeys("1231231231");
		Reporter.log("Phone numbered entered successfully");
	}

	//Entering username
	@Test(priority=9)
	public void username_enter() {
		registration.username.sendKeys("vivek876");
		Reporter.log("Username entered successfully");
	}
	
	//entering email
	@Test(priority=10)
	public void entering_email() {
		registration.email.sendKeys("aa@bb.com");
		Reporter.log("Email entered successfully");
	}
	
	//Profile pic entering
	@Test(priority=11)
	public void select_profilepic() {
		registration.profile_pic.sendKeys("./resource/profilepic.png");
		Reporter.log("Profile pic entered successfully");
	}
	
	//entering about yourself
	@Test(priority=12)
	public void about() {
		registration.description.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Reporter.log("Description entered successfully");
	}
	
	//Entering password
	@Test(priority=13)
	public void password() {
		registration.password.sendKeys("12345678");
		Reporter.log("Password entered successfully");
	}
	
	//entering confirm password
	@Test(priority=14)
	public void confirm_password(){
		registration.confirm_password.sendKeys("12345678");
		Reporter.log("Confirm password entered successfully");
	}
	
	//Submitting form
	@Test(priority=15)
	public void submit_form() {
		registration.submit.click();
		System.out.println("Form submitted successfully");
		Reporter.log("form submitted successfully");
	}
	
//	@Test(priority=16)
//	public void registration_status() {
//		if(registration.thankyoutext.isDisplayed())
//			System.out.println("Registration successfull");
//		
//		else if (registration.error.isDisplayed()) 
//				System.out.println("Error message available");
//		else
//				System.out.println("Error check");
//			
//		}
}
