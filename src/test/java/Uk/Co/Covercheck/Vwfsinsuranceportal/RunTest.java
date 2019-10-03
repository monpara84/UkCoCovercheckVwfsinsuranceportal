package Uk.Co.Covercheck.Vwfsinsuranceportal;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = {"@coverCheck"},plugin = {"pretty","html:target/cucumber.reports/report"})
public class RunTest {

}
