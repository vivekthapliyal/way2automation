package com.demoqa.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.objectclass.Common_method;
import com.demoqa.objectclass.Draggable;
import com.demoqa.objectclass.Homepage;
import com.demoqa.util.Baseclass;

public class Draggable_Test extends Baseclass{
	WebDriver driver=null;
	Draggable draggable=null;
	Common_method common=null;
	Actions action=null;
	
	@BeforeClass
	public void selectbrowser() {
		driver=getDriver();
		draggable=new Draggable(driver);
		common=new Common_method(driver);
		
	}
	
	//Resirecting to draggable page 
	@Test(priority=0)
	public void page_redirect() {
		common.draggable.click();
	}
	
	//clicking default functionality
	@Test(priority=1)
	public void default_functionality() throws InterruptedException {	
		Thread.sleep(5000);

		if(draggable.second_frame.isDisplayed()){
//		draggable.second_frame.click();
		Thread.sleep(5000);
		action=new Actions(driver);
		action.click(draggable.draggable_box).dragAndDropBy(draggable.draggable_box, 100, 100).build().perform();
		Thread.sleep(5000);
		action.click(draggable.draggable_box).dragAndDropBy(draggable.draggable_box, 0, 50).build().perform();

		System.out.println("Action performed successfully");
		}
		else {
			System.out.println("Box is not avaliable");
		}
	}
	
	// Performing container movement
	@Test(priority=2)
	public void container_movement1() throws InterruptedException {
		Thread.sleep(5000);
		draggable.button_constrain.click();
		Thread.sleep(5000);
		if (draggable.dragframe.isDisplayed()) {
			Thread.sleep(5000);
			action=new Actions(driver);
			action.click(draggable.verticle_drag).dragAndDropBy(draggable.verticle_drag, 0, 50).build().perform();
			System.out.println("Vertically moved");
			Thread.sleep(5000);
			action.click(draggable.horizontal_drag).dragAndDropBy(draggable.horizontal_drag, 50, 0).build().perform();
			System.out.println("Drag and drop working successfully");
			
			
		}
		else {
			System.out.println("Item not displaying");
		}
	}
	
	//Move item in different DOM
	@Test(priority=3)
	public void container_movement2() throws InterruptedException {
		Thread.sleep(5000);
		draggable.button_constrain.click();
		Thread.sleep(5000);
		if (draggable.dragframe.isDisplayed()) {
			Thread.sleep(5000);
			action=new Actions(driver);
			action.click(draggable.contain_within_box).dragAndDropBy(draggable.contain_within_box, 100, 100).build().perform();
			System.out.println("container within the box working successfully");
			Thread.sleep(5000);
			action.click(draggable.childcontain_box).dragAndDropBy(draggable.childcontain_box, 50, 0).build().perform();
			System.out.println("Drag and drop working successfully");
			
		}
		else {
			System.out.println("Item not displaying");
		}
	}
	
	// working on cursor style
	@Test(priority=4)
	public void curser_style() throws InterruptedException {
		Thread.sleep(5000);
		draggable.button_cursor_style.click();
		Thread.sleep(5000);
		if (draggable.cursor_frame.isDisplayed()) {
			action=new Actions(driver);
			Thread.sleep(5000);
			action.click(draggable.first_cursor).dragAndDropBy(draggable.first_cursor, 100, 100).build().perform();
			Thread.sleep(2000);
			action.click(draggable.second_cursor).dragAndDropBy(draggable.second_cursor, 100, 100).build().perform();
			Thread.sleep(2000);
			action.click(draggable.third_cursor).dragAndDropBy(draggable.third_cursor, 100, 100).build().perform();
			Thread.sleep(2000);
			action.moveToElement(draggable.third_cursor).build().perform();
			
		} else {
			System.out.println("Element not available");
		}
		
	}
	
	
	// Working on Events 
	@Test(priority=5)
	public void events() throws InterruptedException {
		Thread.sleep(5000);
		draggable.events_button.click();
		Thread.sleep(5000);
		if (draggable.event_frame.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDropBy(draggable.dragevent, 50, 50).dragAndDropBy(draggable.dragevent, 50, 50).dragAndDropBy(draggable.dragevent, 50, 50).build().perform();
			System.out.println("Drag and drop working fine");
		}
		else {
			System.out.println("Frame not available");
		}

	}
	
	//working on Draggable + Events
	@Test(priority=6)
	public void draggableAndEvents() throws InterruptedException {
		Thread.sleep(2000);
		draggable.Drag_sort_button.click();
		Thread.sleep(2000);
		if (draggable.dragand_sortframe.isDisplayed()) {
			action=new Actions(driver);
			action.dragAndDrop(draggable.sortablebox1, draggable.sortablebox5).build().perform();
			System.out.println("Sorting working perfectlly");
		}
		else {
			System.out.println("Frame is not available");
		}
			
	}
	
}
