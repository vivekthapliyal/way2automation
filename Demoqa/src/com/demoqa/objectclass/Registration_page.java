package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {
	WebDriver driver;
	public Registration_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Finding Registration text 
	@FindBy(xpath=".//*[@id='post-49']/header/h1")
	public WebElement registration;
	
	//Finding First name 
	@FindBy(xpath=".//*[@id='name_3_firstname']")
	public WebElement firstname;
		
	//Finding Registration text 
	@FindBy(xpath=".//*[@id='name_3_lastname']")
	public WebElement lastname;
		
		
	//Finding single maritial status
	@FindBy(xpath=".//*[@id='pie_register']/li[2]/div/div/input[1]")
	public WebElement maritailstatus_single;
	
	//Finding maritial status
	@FindBy(xpath=".//*[@id='pie_register']/li[2]/div/div/input[2]")
	public WebElement maritailstatus_married;
	
	//Finding maritial status
	@FindBy(xpath=".//*[@id='pie_register']/li[2]/div/div/input[3]")
	public WebElement maritailstatus_divorced;
	
	
	//Finding hobby status
	@FindBy(xpath=".//*[@id='pie_register']/li[3]/div/div/input[1]")
	public WebElement hobby_dance;
	
	//Finding hobby status
	@FindBy(xpath=".//*[@id='pie_register']/li[3]/div/div/input[2]")
	public WebElement hobby_reading;
		
		
	//Finding hobby status
	@FindBy(xpath=".//*[@id='pie_register']/li[3]/div/div/input[3]")
	public WebElement hobby_cricket;
			
	
	
	//Finding countary status
	@FindBy(xpath=".//*[@id='dropdown_7']")
	public WebElement countary;
	
	
	//Finding dob month status
	@FindBy(xpath=".//*[@id='mm_date_8']")
	public WebElement dob_month;
	
	//Finding dob date status
	@FindBy(xpath=".//*[@id='dd_date_8']")
	public WebElement dob_date;
		
		
	//Finding dob year status
	@FindBy(xpath=".//*[@id='yy_date_8']")
	public WebElement dob_year;
		
		
	//Finding phone number field
	@FindBy(xpath=".//*[@id='phone_9']")
	public WebElement phone_number;
	
	//Finding username field
	@FindBy(xpath=".//*[@id='username']")
	public WebElement username;
	
	
	
	//Finding Email field
	@FindBy(xpath=".//*[@id='email_1']")
	public WebElement email;
	
	
	
	//Finding profile pic
	@FindBy(xpath=".//*[@id='profile_pic_10']")
	public WebElement profile_pic;
	
	
	//Finding description
	@FindBy(xpath=".//*[@id='description']")
	public WebElement description;
	
	//Finding password
	@FindBy(xpath=".//*[@id='password_2']")
	public WebElement password;
	
	//Finding confirm password
	@FindBy(xpath=".//*[@id='confirm_password_password_2']")
	public WebElement confirm_password;
	
	
	//Finding strength indicater
	@FindBy(xpath=".//*[@id='piereg_passwordStrength']]")
	public WebElement s_indicater;
	
	
	//Finding submit button 
	@FindBy(xpath=".//*[@id='pie_register']/li[14]/div/input")
	public WebElement submit;
	
	// thank you text 
	@FindBy(xpath=".//*[@id='post-49']/div/p")
	public WebElement thankyoutext;
	
	//Error message
	@FindBy(xpath=".//*[@id='profile_pic_10']")
	public WebElement error;
	
}
