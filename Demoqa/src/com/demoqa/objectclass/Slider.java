package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slider {
	public Slider(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding header
	@FindBy(xpath=".//*[@id='post-76']/header/h1")
	public WebElement header;
	
	//Finding Frame
	@FindBy(xpath=".//*[@id='tabs-2']")
	public WebElement frame1;
	
	//Finding slider 
	@FindBy(xpath=".//*[@id='slider-range-max']")
	public WebElement sliderform;
}
