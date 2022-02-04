package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Selenium_Workspace\\FreeCrmBDDFramework1\\src\\main\\java\\Features\\tagging.feature",
		glue= {"stepDefinition"},// the path of the step definition file
		format= {"pretty","html:test-output","json:json.output/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate different types of reporting
		monochrome= true,//display the console output in a proper readable format
		strict= true,//it will check any step is not defined in step defintion file 
		dryRun = false,// to check the mapping is proper between feature file and step defintiion file 
		tags = {"~@SmokeTest" ," ~@RegressionTest",}
		)
		
		
		
		 
public class TestRunner {

}

//OR: Tags ={"@smoketest,  @regressiontest"}=-- execute all tests tagged as @SmokeTest OR @Regressintest
//ANDED: Tags = tags = {"@smoketest",  "@regressiontest"}=-- execute all tests tagged as @SmokeTest OR @Regressintest