package sampleTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\sampleTest\\src\\test\\java\\sampleTest\\cucumber.feature",glue= {"sampleTest"})

public class runner extends AbstractTestNGCucumberTests {

}
