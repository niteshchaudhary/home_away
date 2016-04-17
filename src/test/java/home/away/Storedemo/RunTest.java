package home.away.Storedemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions( format = { "pretty", "html:target/cucumber/ui",
		"junit:target/cucumber-junit-report/allcukes.xml"}, features = { "C:\\Users\\Nitesh\\Documents\\maven\\HomeAway\\Storedemo\\src\\test\\resources\\feature\\demostore.feature" } )
@RunWith(Cucumber.class)
public class RunTest{
	
}
