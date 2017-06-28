package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tooltip {
	public Tooltip(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding header 
	@FindBy(xpath=".//*[@id='post-84']/header/h1")
	public WebElement header;
	
	//Finding frame 1 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	//finding text box 
	@FindBy(xpath=".//*[@id='age']")
	public WebElement textbox;
	
	//finding box title
	@FindBy(id="age")
	public WebElement age;
	
//	//Test
//	@FindBy(xpath=".//*[@id='ui-id-117']/div")
//	public WebElement text;
}
