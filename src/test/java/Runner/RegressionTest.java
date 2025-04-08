package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class RegressionTest extends AbstractTestNGCucumberTests {
}
