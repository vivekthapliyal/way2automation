package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_method {
	WebDriver driver=null;
	
	//creating constructor for initializing elements
	public Common_method(WebDriver driver) {
//		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Finding logo in header
	@FindBy(xpath="..//*[@id='site_navigation']/div/div[1]/a/img")
	public WebElement websitelogo;
		
	//Finding home tab in header
	@FindBy(xpath=".//*[@id='menu-item-38']/a")
	public WebElement hometab;
	
	//Finding about us link in header
	@FindBy(xpath=".//*[@id='menu-item-158']/a")
	public WebElement aboutus;
	
	//Finding services link in header
	@FindBy(xpath=".//*[@id='menu-item-155']/a")
	public WebElement services;
	
	//Finding services link in header
	@FindBy(xpath=".//*[@id='menu-item-66']/a")
	public WebElement demo;
	
	
	//Finding home blog header
	@FindBy(xpath=".//*[@id='menu-item-65']/a")
	public WebElement blog;
	
	
	//Finding home contact link in header
	@FindBy(xpath=".//*[@id='menu-item-64']/a")
	public WebElement contactus;
	
	//Finding registration button 
	@FindBy(xpath=".//*[@id='menu-item-374']")
	public WebElement registratrion ;
	
	//finding draggable button.
	@FindBy(xpath=".//*[@id='menu-item-140']")
	public WebElement draggable;
	
	//finding droppable button.
	@FindBy(xpath=".//*[@id='menu-item-141']")
	public WebElement droppable;
	
	//finding resizble button.
	@FindBy(xpath=".//*[@id='menu-item-143']")
	public WebElement resizable;
	
	//finding selectable button.
	@FindBy(xpath=".//*[@id='menu-item-142']/a")
	public WebElement selectable;
	
	//finding sortable button.
	@FindBy(xpath=".//*[@id='menu-item-151']")
	public WebElement sortable;
	

	//finding accordion
	@FindBy(xpath=".//*[@id='menu-item-144']")
	public WebElement accordion;
	
	//Finding autocomplete button
	@FindBy(xpath=".//*[@id='menu-item-145']")
	public WebElement autocomplete;
	
	
	//Finding DatePicker
	@FindBy(xpath=".//*[@id='menu-item-146']")
	public WebElement datepicker;
	
	//Finding Menu button
	@FindBy(xpath=".//*[@id='menu-item-147']")
	public WebElement menu;
	
	// Finding slider button
	@FindBy(xpath=".//*[@id='menu-item-97']")
	public WebElement slider;
	
	//Finding Tabs 
	@FindBy(xpath=".//*[@id='menu-item-98']")
	public WebElement tabs;
	
	//Finding Tooltip
	@FindBy(xpath=".//*[@id='menu-item-99']")
	public WebElement tooltip;
	
	//Finding Frames
	@FindBy(xpath=".//*[@id='menu-item-148']")
	public WebElement frames;
}
