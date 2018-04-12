package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/java/feature"}
,plugin= {"pretty", "html:target/cucumber-report/html"}
//,tags= {""}
,glue= {""}
		)
public class Sprint1Runner extends AbstractTestNGCucumberTests{

}
