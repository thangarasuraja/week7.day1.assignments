package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefs.ProductSpecificMethods;


@CucumberOptions(features="src/test/java/features",
                 glue="stepDefs",
                 monochrome=true,
                 publish=true)

public class RunnerCucumberTests extends ProductSpecificMethods{

}
