package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resizable {
	WebDriver driver=null;
	public Resizable(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding resizable header
	@FindBy(xpath=".//*[@id='post-80']/header/h1")
	public WebElement resizable_header;
	
	//finding default functionality button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement button_default_functionality;
	
	//Finding frame1 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	//finding resizable 1 element
	@FindBy(xpath=".//*[@id='resizable']")
	public WebElement resizable;
	
	//finding resizable edge 1 
	@FindBy(xpath=".//*[@id='resizable']/div[3]")
	public WebElement resizable_element;
	
	//Finding Animate button
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement button_animate;
	
	//Finding frame 2 
	@FindBy(xpath=".//*[@id='tabs-2']")
	public WebElement frame2;
	
	//Finding animate box 
	@FindBy(xpath=".//*[@id='resizableani']")
	public WebElement animatebox;
	
	//Finding animate box edge
	@FindBy(xpath=".//*[@id='resizableani']/div[3]")
	public WebElement animate_edge;
	
	//Finding max size
	@FindBy(xpath=".//*[@id='ui-id-5']")
	public WebElement button_maxsize;
	
	// Finding frame 5
	@FindBy(xpath=".//*[@id='tabs-5']")
	public WebElement frame5;
	
	//Finding resize max element
	@FindBy(xpath=".//*[@id='resizable_max_min']")
	public WebElement resizemax;
	
	//find resize max / min edge 
	@FindBy(xpath=".//*[@id='resizable_max_min']/div[3]")
	public WebElement resize_max_min;
}
