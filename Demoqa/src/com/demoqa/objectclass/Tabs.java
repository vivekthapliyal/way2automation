package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tabs {
	public Tabs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//finding tabs header
	@FindBy(xpath=".//*[@id='post-82']/header/h1")
	public WebElement tab_header;
	
	//finding tab frame
	@FindBy(xpath=".//*[@id='post-82']/div")
	public WebElement frame;
	
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement tab1;
	
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement tab2;
	
	@FindBy(xpath=".//*[@id='ui-id-3']")
	public WebElement tab3;
	
}
