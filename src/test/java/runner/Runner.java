package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anany\\eclipse-workspace\\PHASE2Cucumber\\src\\test\\java\\features\\final.feature",
				 glue= {"steps"},
				 plugin= {"html:target/Cucumberreport.html",
						 "pretty",
//						
				}
				 )

public class Runner {

}
