package com.demoqa.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	public Menu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//finding simple menu button
	@FindBy(xpath=".//*[@id='ui-id-1']")
	public WebElement button_simplemenu;
	
	//Finding frame 1 
	@FindBy(xpath=".//*[@id='tabs-1']")
	public WebElement frame1;
	
	//Finding Home item
	@FindBy(xpath=".//*[@id='navigate']/ul/li[1]/a")
	public WebElement menu_home;
	
	//Finding About item
	@FindBy(xpath=".//*[@id='navigate']/ul/li[2]/a")
	public WebElement menu_about;
	
	//Finding contact item
	@FindBy(xpath=".//*[@id='navigate']/ul/li[3]/a")
	public WebElement menu_contact;
	
	//Finding FAQ link
	@FindBy(xpath=".//*[@id='navigate']/ul/li[4]/a")
	public WebElement menu_faq;
	
	//Finding News link
	@FindBy(xpath=".//*[@id='navigate']/ul/li[5]/a")
	public WebElement menu_news;
	
	//Finding Submenu
	@FindBy(xpath=".//*[@id='ui-id-2']")
	public WebElement submenu_button;
	
	//Finding frame 2 
	@FindBy(xpath=".//*[@id='tabs-2']")
	public WebElement frame2;
	
	//Finding home menu
	@FindBy(xpath=".//*[@id='navigate']/ul/li[1]/a")
	public WebElement menu_home1;
	
	//finding home submenu item 1 
	@FindBy(xpath=".//*[@id='navigate']/ul/li[1]/ul/li[1]")
	public WebElement home_submenu1;
	
	//Finding Home submenu item 4 
	@FindBy(xpath=".//*[@id='navigate']/ul/li[1]/ul/li[4]/a")
	public WebElement home_submenu4;
	
	//Finding about menu
	@FindBy(xpath=".//*[@id='navigate']/ul/li[2]/a")
	public WebElement about_menu;
	
	//Finding FAQ menu 
	@FindBy(xpath=".//*[@id='navigate']/ul/li[4]/a")
	public WebElement menu_faq1;
	
	//finding faq item1 
	@FindBy(xpath=".//*[@id='navigate']/ul/li[4]/ul/li[1]/a")
	public WebElement faqitem1;
	
	//finging faqitem 3 
	@FindBy(xpath=".//*[@id='navigate']/ul/li[4]/ul/li[2]/a")
	public WebElement faqitem3;
	
}
