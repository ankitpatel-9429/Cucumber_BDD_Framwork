package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "E:\\Java\\Selenium_WorkSpace\\BDD_CucumberFramework\\src\\main\\java\\Features\\DataTable_Map.feature", //the path of the feature files
			glue={"helpers","StepDefinitions"},
			format = {"pretty","html:test-outout","json:json_cucumber/index.json","junit:junit_cucumber/index.xml"},//to generate different types of reporting
			dryRun = false,
			strict = true, 
			monochrome = true
			
			)
	 
	public class TestRunner {
	 
	}