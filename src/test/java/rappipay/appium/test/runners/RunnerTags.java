package rappipay.appium.test.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/saucelabs.feature",
        tags = "@LoginSuccess",
        glue = "rappipay.appium.test.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunnerTags {
}