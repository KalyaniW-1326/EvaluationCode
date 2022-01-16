package com.evaluation.testCases;

import org.testng.annotations.Test;

import com.evaluation.base.BaseTest;
import com.pageEvents.InteractionPageEvents;




public class WebAutomation_Case1 extends BaseTest {
	@Test
	public void performDragAndDropForWebAutomation(){
		InteractionPageEvents interactionPageEvents= new InteractionPageEvents();
		interactionPageEvents.clickOnDroppable();
		interactionPageEvents.dragAndDropTheObject();
		
	}

}
