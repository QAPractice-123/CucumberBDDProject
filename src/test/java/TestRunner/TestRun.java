package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Features/LoginFeature.feature",".//Features/Registration.feature"},
		glue="StepDefinition",
		
		//once clicked on run to checked first time then next time keep it false
		
		dryRun= false, //To check the mapping of feature and steps file.
					//if true than check all the steps in feature file has implementation in step file or not
					//otherwise this method skip. 
		
		monochrome= true, //to keep output in readable format, keep as true 
//		plugin= {"pretty", "html:target/cucumber-reports/report_html.html",//to generate report in html format and give path
//		"json:target/cucumber-reports/report_json.json", //to generate report in Json format and give path
//		"junit:target/cucumber-reports/report_xml.xml",//to generate report in Json format and give path
//		"junit:target/cucumber-reports/report_junit"} //to generate report in Json format and give path
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class TestRun extends AbstractTestNGCucumberTests{
//This class will be empty
}
