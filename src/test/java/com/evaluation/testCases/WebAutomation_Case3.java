package com.evaluation.testCases;

import org.testng.annotations.Test;

import com.evaluation.base.BaseTest;
import com.pageEvents.WidgetsPageEvents;

public class WebAutomation_Case3 extends BaseTest{
	@Test
	public void performBookOperation() {
		WidgetsPageEvents widgetPageEvents = new WidgetsPageEvents();
		widgetPageEvents.clickOnControlGroup();
		widgetPageEvents.selectElements();
		widgetPageEvents.bookNow();
	}

}
