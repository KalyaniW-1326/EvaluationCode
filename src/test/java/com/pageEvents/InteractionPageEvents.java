package com.pageEvents;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.evaluation.base.BaseTest;
import com.pageObjects.InteractionElements;
import com.utils.ElementOperations;



public class InteractionPageEvents {
	ElementOperations elementFetch = new ElementOperations();
	InteractionElements interactionElements = new InteractionElements();

	public void clickOnDroppable() {
		ElementOperations.getWebElement("XPATH", interactionElements.Droppable).click();
		BaseTest.logger.info("Droppable clicked");
	}

	public void dragAndDropTheObject() {
		
		ElementOperations.switchToFrame("TAGNAME", interactionElements.frame);
		ElementOperations.performDragAndDrop("ID", interactionElements.DragMe, interactionElements.Dropped);
		BaseTest.logger.info("Drag and Drop performed");
	}
	
	public void clickSelectable() {
		ElementOperations.getWebElement("XPATH", interactionElements.Selectable).click();
		BaseTest.logger.info("Selectable clicked");
	}
	
	public void clickItems() {
		ElementOperations.scrollInMiddle();
		ElementOperations.switchToFrame("TAGNAME", interactionElements.frame);
		List<WebElement> getItemList=ElementOperations.getWebElements("XPATH", interactionElements.Item);
		try {
			for(WebElement element : getItemList) {
				String ItemText= element.getText();
				if(ItemText.equals("Item 1") || ItemText.equals("Item 3") || ItemText.equals("Item 7")) {
					ElementOperations.performKeyboardOperations(element);
					
				}
			}
			BaseTest.logger.info("Items Selected");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
