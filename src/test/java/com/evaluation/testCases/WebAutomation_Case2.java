package com.evaluation.testCases;

import org.testng.annotations.Test;

import com.evaluation.base.BaseTest;
import com.pageEvents.InteractionPageEvents;

public class WebAutomation_Case2 extends BaseTest{
	@Test
	public void performSelectListOptions() {
		InteractionPageEvents interactionPageEvents= new InteractionPageEvents();
		interactionPageEvents.clickSelectable();
		interactionPageEvents.clickItems();
		
	}
	

}
