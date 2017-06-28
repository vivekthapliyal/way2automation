package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Draggable {
	WebDriver driver ;
	
	//creating constructor
	public Draggable(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='tabs']/ul")
	public WebElement first_frame;
	
	//Finding second frame 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement second_frame;
	
	//Finding default functionality button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement button_defaultfunctionality;
	
	// Finding Draggable box
	@FindBy(xpath=".//*[@id='draggable']")
	public WebElement draggable_box;
	
	//Finding constraint movement button
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement button_constrain;
	
	//Finding drag frame
	@FindBy(xpath=".//*[@id='tabs-3']")
	public WebElement dragframe;
	
	//Finding vertical draggable
	@FindBy(xpath=".//*[@id='draggabl']")
	public WebElement verticle_drag;
	
	//Finding horizontal drag
	@FindBy(xpath=".//*[@id='draggabl2']")
	public WebElement horizontal_drag;
	
	//Finding another DOM
	@FindBy(xpath=".//*[@id='containment-wrapper']")
	public WebElement other_Dom;
	
	//Finding dom_drag
	@FindBy(xpath=".//*[@id='draggabl3']")
	public WebElement contain_within_box;
	
	//finding parent contain box
	@FindBy(xpath=".//*[@id='containment-wrapper']/div[2]")
	public WebElement parentcontain_box;
	
	//Finding child contain box
	@FindBy(xpath=".//*[@id='draggabl5']")
	public WebElement childcontain_box;
	
	//finding Cursor Style button
	@FindBy(xpath=".//*[@id='tabs']/ul/li[3]")
	public WebElement button_cursor_style;
	
	//finding cursor frame
	@FindBy(xpath=".//*[@id='tabs-4']")
	public WebElement cursor_frame;
	
	//Finding first cursor type 
	@FindBy(xpath=".//*[@id='drag']")
	public WebElement first_cursor;
	
	//finding second cursor 
	@FindBy(xpath=".//*[@id='drag2']")
	public WebElement second_cursor;
	
	//Finding third cursor
	@FindBy(xpath=".//*[@id='drag3']")
	public WebElement third_cursor;
	
	
	//Finding events button
	@FindBy(xpath=".//*[@id='ui-id-4']")
	public WebElement events_button;
	
	//finding events button
	@FindBy(xpath=".//*[@id='tabs-5']")
	public WebElement event_frame;
	
	//finding drag event 
	@FindBy(xpath=".//*[@id='dragevent']")
	public WebElement dragevent;
	
	
	//finding draggable + Events button
	@FindBy(xpath=".//*[@id='ui-id-5']")
	public WebElement Drag_sort_button;
	
	//Finding drag and sort frame
	@FindBy(xpath=".//*[@id='tabs-7']")
	public WebElement dragand_sortframe;
	
	//Finding item 1 
	@FindBy(xpath=".//*[@id='sortablebox']/li[1]")
	public WebElement sortablebox1;
	
	//Finding item 2 
	@FindBy(xpath=".//*[@id='sortablebox']/li[2]")
	public WebElement sortablebox2;
	
	//Finding item 3
	@FindBy(xpath=".//*[@id='sortablebox']/li[3]")
	public WebElement sortablebox3;
	
	//Finding item 4
	@FindBy(xpath=".//*[@id='sortablebox']/li[4]")
	public WebElement sortablebox4;
	
	//Finding item 5
	@FindBy(xpath=".//*[@id='sortablebox']/li[5]")
	public WebElement sortablebox5;
}
