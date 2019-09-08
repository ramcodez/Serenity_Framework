package ui.pages;

import net.serenitybdd.core.pages.PageObject;

public class reduxPage extends PageObject {

	
	public void launchGoogle() {
		getDriver().get("https://www.google.com");
		waitABit(50000);
	}
	
}
