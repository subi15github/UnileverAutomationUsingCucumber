package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = "Steps",
    plugin = {"pretty",
    		  "html:target/cucumber-reports",
    		  "json:target/cucumber-reports/Cucumber.json",
    		  "junit:target/cucumber-reports/Cucumber.xml"
    			  },
    monochrome = true
)
public class TestRunner {

}
