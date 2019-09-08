package ui.steps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import ui.pages.reduxPage;

public class CommonStepDefinitions {
	
	@Steps
	reduxPage rPage;
	
	@Given("^I want to write a step with precondition$")
	public void resuxCall() {
		rPage.launchGoogle();
	}

}
