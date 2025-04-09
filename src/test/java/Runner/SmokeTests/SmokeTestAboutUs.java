package Runner.SmokeTests;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@SmokeTestAboutUs",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class SmokeTestAboutUs extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserType")
    public  static void writeExtendReport(@Optional("chrome")String browserType)
    {
        GWD.threadBrowserName.set(browserType);
    }
}
