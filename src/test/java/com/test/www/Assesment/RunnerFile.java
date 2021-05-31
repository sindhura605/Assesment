package com.test.www.Assesment;

import org.junit.runner.RunWith;
import com.test.www.framework.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/features"
 ,glue={"com.test.www.stepDefinitions","com.test.www.pages"},tags="@SampleTest", plugin = { "pretty","json:target/cucumber-json/cucumber.json",
         "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports/index.html"}
)
public class RunnerFile {
	

}
