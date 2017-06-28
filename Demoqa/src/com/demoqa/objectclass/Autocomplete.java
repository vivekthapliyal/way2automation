package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Autocomplete {
	public Autocomplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//finding header 
	@FindBy(xpath=".//*[@id='post-36']/header/h1")
	public WebElement header_text;
	
	//finding frame 1 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	//Finding textbox 
	@FindBy(xpath=".//*[@id='tagss']")
	public WebElement textbox;
	
	
	//finding list
	@FindBy(className="ui-menu-item")
	public WebElement menu_item;
	
}
