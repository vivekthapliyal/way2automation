package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames_windows {
	public Frames_windows(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding Open new button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement button_open_window;
	
	//Finding header
	@FindBy(xpath=".//*[@id='post-11']/header/h1")
	public WebElement header;
	
	//Finding frame 1
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	//Finding new browser window
	@FindBy(xpath=".//*[@id='tabs-1']/div/p/a")
	public WebElement new_browser;
	
	//Finding seperate window button
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement buttom_seperate_window;
	
	//Finding frame 2
	@FindBy(xpath=".//*[@id='tabs-2']")
	public WebElement frame2;
	
	//Findind new seperatelnk
	@FindBy(xpath=".//*[@id='tabs-2']/div/p/a")
	public WebElement newseperate_link;
	
	//Finding text box in new opened link
	@FindBy(xpath=".//*[@id='post-0']/form/input[1]")
	public WebElement text_box;
	
	//Finding frameset button
	@FindBy(xpath=".//*[@id='ui-id-3']")
	public WebElement button_frameset;
	
	//Finding frame 3
	@FindBy(xpath=".//*[@id='tabs-3']")
	public WebElement frame3;
	
	//Finding frame set link
	@FindBy(xpath=".//*[@id='tabs-3']/div/p/a")
	public WebElement frameset;
	
	
	
	//Finding upper frame set
	@FindBy(xpath="html/body/div[1]/p")
	public WebElement upperframecontant;
	
	//Finding lower frame
	@FindBy(xpath="html/body/div[1]/p")
	public WebElement lowerframecontent;
	
	//Finding top frame
	@FindBy(name="topFrame")
	public WebElement topframe;
	
	//finding content frame
	@FindBy(name="contentFrame")
	public WebElement bottomframe;
	
	
}
