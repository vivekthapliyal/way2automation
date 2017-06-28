package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectable {
	public Selectable(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Findind header 
	@FindBy(xpath=".//*[@id='post-41']/header/h1")
	public WebElement header;
	
	//Finding default functionality button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement default_functionality;
	
	//Finding frame 1 
	@FindBy(xpath="//*[@id='tabs-1']")
	public WebElement frame1;
	
	//finding item 1 
	@FindBy(xpath=".//*[@id='selectable']/li[1]")
	public WebElement item1;
	
	//finding item 2 
	@FindBy(xpath=".//*[@id='selectable']/li[2]")
	public WebElement item2;
	
	//finding item 3
	@FindBy(xpath=".//*[@id='selectable']/li[3]")
	public WebElement item3;
	
	//finding item 4 
	@FindBy(xpath=".//*[@id='selectable']/li[4]")
	public WebElement item4;
	
	//finding item 5
	@FindBy(xpath=".//*[@id='selectable']/li[5]")
	public WebElement item5;

	//finding item 6 
	@FindBy(xpath=".//*[@id='selectable']/li[6]")
	public WebElement item6;

	//finding item 7
	@FindBy(xpath=".//*[@id='selectable']/li[7]")
	public WebElement item7;
	
	//Finding display grid button
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement button_grid;
	
	//Finding frame 2
	@FindBy(xpath=".//*[@id='tabs-2']")
	public WebElement frame2;
	
	//Finding grid item 1 
	@FindBy(xpath=".//*[@id='selectable_grid']/li[1]")
	public WebElement grid_item1;
	
	//Finding grid item 2 
	@FindBy(xpath=".//*[@id='selectable_grid']/li[1]")
	public WebElement grid_item2;
	
	//Finding grid item 3
	@FindBy(xpath=".//*[@id='selectable_grid']/li[3]")
	public WebElement grid_item3;
	
	//Finding grid item 4
	@FindBy(xpath=".//*[@id='selectable_grid']/li[4]")
	public WebElement grid_item4;
	
	
	//Finding grid item 5 
	@FindBy(xpath=".//*[@id='selectable_grid']/li[5]")
	public WebElement grid_item5;
	
	//Finding grid item 6 
	@FindBy(xpath=".//*[@id='selectable_grid']/li[6]")
	public WebElement grid_item6;
	
	//Finding grid item 7 
	@FindBy(xpath=".//*[@id='selectable_grid']/li[7]")
	public WebElement grid_item7;
	
	//Finding grid item 8
	@FindBy(xpath=".//*[@id='selectable_grid']/li[8]")
	public WebElement grid_item8;
	
	
}
