package Runner;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_05_StoreMenu.feature",
                "src/test/java/FeatureFiles/_06_StoreAllePieces.feature",

        },
        glue = {"StepDefinitions"}
        //,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class CrossBrowser extends AbstractTestNGCucumberTests  {


    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserTipi)
    {
        GWD.threadBrowserName.set(browserTipi);

    }

}