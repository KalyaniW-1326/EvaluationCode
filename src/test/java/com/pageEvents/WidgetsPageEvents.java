package com.pageEvents;

import java.util.concurrent.TimeUnit;

import com.evaluation.base.BaseTest;
import com.pageObjects.InteractionElements;
import com.pageObjects.WidgetsElements;
import com.utils.ElementOperations;

public class WidgetsPageEvents {
	public void clickOnControlGroup() {
		ElementOperations.getWebElement("XPATH", WidgetsElements.ControlGroup).click();
		BaseTest.logger.info("Control clicked");
	}
	
	public void selectElements() {
		try {
		ElementOperations.scrollInMiddle();
		ElementOperations.switchToFrame("TAGNAME", InteractionElements.frame);
		ElementOperations.scrollInMiddle();
		ElementOperations.getWebElement("XPATH", WidgetsElements.Automatic).click();
		ElementOperations.getWebElement("XPATH", WidgetsElements.Insurance).click();
		ElementOperations.getWebElement("XPATH", WidgetsElements.AutomaticVertical).click();
		ElementOperations.waitForElementToBeClickable(WidgetsElements.InsuranceVertical);
		ElementOperations.getWebElement("XPATH", WidgetsElements.InsuranceVertical).click();		
		}catch(Exception e) {
			System.out.println("In selectAndBook class" +e);
		}
		
	}
	public void bookNow() {
		ElementOperations.getWebElement("ID", WidgetsElements.BookNow).click();
		BaseTest.logger.info("selectAndBook Operation Performed");
		
	}
}
