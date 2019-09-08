package ui.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/ui/features", glue="ui.steps", tags= {"@tag1"},  monochrome=true)
public class ReduxRunner {

}
