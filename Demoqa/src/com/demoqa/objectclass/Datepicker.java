package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datepicker {
	public Datepicker(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding frame 1 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	
	//Finding datepicker box
	@FindBy(xpath=".//*[@id='datepicker1']")
	public WebElement datepicker;
	
	//Finding Calendar
	@FindBy(xpath=".//*[@id='ui-datepicker-div']")
	public WebElement calendar;
	
	
}
