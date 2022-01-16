package com.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.evaluation.base.BaseTest;





public class ElementOperations {
	public static WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(identifierValue));
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		default:
			return null;
		}
	}

	public static List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(identifierValue));
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		default:
			return null;
		}
	}

	/**
	 * DragandDrop Operation
	 */
	public static void performDragAndDrop(String identifierType,String dragMe, String dropHere) {
		WebElement DragMe= getWebElement(identifierType,dragMe);
		WebElement DropHere= getWebElement(identifierType,dropHere);
		Actions act = new Actions(BaseTest.driver);	
		act.dragAndDrop(DragMe, DropHere).perform();
	}
	
	public static void performKeyboardOperations(WebElement elementsToClick) {
		
		Actions action=new Actions(BaseTest.driver);
		action.keyDown(Keys.CONTROL).click(elementsToClick).keyUp(Keys.CONTROL).build().perform();
		
	}
	
	public static void scrollInMiddle() {
		((JavascriptExecutor)BaseTest.driver).executeScript("scroll(0, 250);");     
	}

	/**
	 * Switch to frame
	 */
	public static void switchToFrame(String identifierType,String frame) {
		try {
			WebElement iFrame=getWebElement(identifierType,frame);
			System.out.println(iFrame);
			if (IsFramePresent()==true) {
				BaseTest.driver.switchTo().frame(iFrame);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Check if frame is present on current page
	 */
	public static boolean IsFramePresent() {
		String frameType = null;
		if (BaseTest.driver.findElements(By.tagName("iframe")).size() > 0) {
			frameType = "iframe";
		} else {
			frameType = "frame";
		}
		List<WebElement> frames = BaseTest.driver.findElements(By.tagName(frameType));
		return frames.size() > 0;
	}
	

}
