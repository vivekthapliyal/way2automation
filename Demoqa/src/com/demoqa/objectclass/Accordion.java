package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accordion {
	public Accordion(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding header text
	@FindBy(xpath=".//*[@id='post-40']/header/h1")
	public WebElement header;
	
	//Finding default functionality button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement button_default_functionality;
	
	//finding frame 1
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	//Section 1 header
	@FindBy(xpath=".//*[@id='ui-id-4']")
	public WebElement section1_header;
	
	//finding section 1  body
	@FindBy(xpath=".//*[@id='ui-id-5']")
	public WebElement section1;
	
	//Finding section 2 header
	@FindBy(xpath=".//*[@id='ui-id-6']")
	public WebElement section2_header;
	
	//Finding section 2 header
	@FindBy(xpath=".//*[@id='ui-id-7']")
	public WebElement section2;
	
	
	
}
