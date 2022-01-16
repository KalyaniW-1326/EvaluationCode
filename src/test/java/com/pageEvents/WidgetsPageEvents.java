package com.pageEvents;

import com.evaluation.base.BaseTest;
import com.pageObjects.InteractionElements;
import com.pageObjects.WidgetsElements;
import com.utils.ElementOperations;

public class WidgetsPageEvents {
	public void clickOnControlGroup() {
		ElementOperations.getWebElement("XPATH", WidgetsElements.ControlGroup).click();
		BaseTest.logger.info("Control clicked");
	}
	
	public void selectAndBook() {
		try {
		ElementOperations.scrollInMiddle();
		ElementOperations.switchToFrame("TAGNAME", InteractionElements.frame);
		ElementOperations.scrollInMiddle();
		ElementOperations.getWebElement("XPATH", WidgetsElements.Automatic).click();
		ElementOperations.getWebElement("XPATH", WidgetsElements.Insurance).click();
		ElementOperations.getWebElement("XPATH", WidgetsElements.AutomaticVertical).click();
		ElementOperations.getWebElement("XPATH", WidgetsElements.InsuranceVertical).click();
		ElementOperations.getWebElement("ID", WidgetsElements.BookNow).click();
		BaseTest.logger.info("selectAndBook Operation Performed");
		}catch(Exception e) {
			System.out.println("In selectAndBook class" +e);
		}
		
	}

}
