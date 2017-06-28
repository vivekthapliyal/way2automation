package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Droppable {
	WebDriver driver=null;
	public Droppable(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Finding page title droppable
	@FindBy(xpath=".//*[@id='post-19']/header/h1")
	public WebElement droppabletitle;
	
	//Finding default functionality button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement default_functionality;
	
	//Finding frame 1 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	
	//Finding source  in default 
	@FindBy(xpath=".//*[@id='draggableview']")
	public WebElement default_source;
	
	//finding targer for frame 1 
	@FindBy(xpath=".//*[@id='droppableview']")
	public WebElement default_target ;
	
	
	//Finding accept button
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement acceptbutton;
	
	//Finding frame2
	@FindBy(xpath=".//*[@id='tabs-2']")
	public WebElement frame2;
	
	//Finding daggable source
	@FindBy(xpath=".//*[@id='draggable-nonvalid']")
	public WebElement draggable_source;
	
	//Finding drag and dropable source
	@FindBy(xpath=".//*[@id='draggableaccept']")
	public WebElement drag_drop_source;
	
	//Finding target source
	@FindBy(xpath=".//*[@id='droppableaccept']")
	public WebElement target;
	
	//Finding shopping cart demo button
	@FindBy(xpath=".//*[@id='ui-id-5']")
	public WebElement shopping_cart_button;
	
	//Finding frame 5 
	@FindBy(xpath=".//*[@id='tabs-5']")
	public WebElement frame5;
	
	//Finding product subframe
	@FindBy(xpath=".//*[@id='products']")
	public WebElement product_subframe;
	
	//Finding Shopping cart subframe
	@FindBy(xpath=".//*[@id='cart']")
	public WebElement shoppingcart_subframe;
	
	//Finding tshirt menu
	@FindBy(xpath=".//*[@id='ui-id-6']")
	public WebElement tshirt_menu;
	
	//finding Bags menu
	@FindBy(xpath=".//*[@id='ui-id-8']")
	public WebElement bags_menu;
	
	//Finding Gadgets menu
	@FindBy(xpath=".//*[@id='ui-id-10']")
	public WebElement gadgets;
	
	//Finding local shirt item
	@FindBy(xpath=".//*[@id='ui-id-7']/ul/li[1]")
	public WebElement local_shirt;
	
	//Finding buckit shirt
	@FindBy(xpath=".//*[@id='ui-id-7']/ul/li[3]")
	public WebElement bucketshirt;
	
	//Finding cart box
	@FindBy(xpath=".//*[@id='cart']/div/ol")
	public WebElement cartbox;
	
	
}
