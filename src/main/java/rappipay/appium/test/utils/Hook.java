package rappipay.appium.test.utils;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hook {
    @Before
    public void setup() {
        if (OnStage.theActorInTheSpotlight() != null) {
            BrowseTheWeb.as(OnStage.theActorInTheSpotlight())
                    .getDriver()
                    .manage()
                    .timeouts()
                    .implicitlyWait(Duration.ofSeconds(20));
        }
    }
}
