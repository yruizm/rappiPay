package rappipay.appium.test.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import rappipay.appium.test.questions.Validate;
import rappipay.appium.test.tasks.OpenApp;
import rappipay.appium.test.tasks.SendCredentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AutenticationSaucelabs {
    @Managed(driver = "appium")
    WebDriver driver;

    @Before(order = 1) // Después del Hook que inicializa el driver
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre la aplicación")
    public void queElUsuarioAbreLaAplicación() {
        OnStage.theActorCalled("Edgerunners");
               // .wasAbleTo(OpenApp.launchApp());
    }

    @When("ingresa las credenciales de acceso {string} y {string}")
    public void ingresaLasCredencialesDeAccesoY(String username, String userkey) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendCredentials.writeCredenciales(username,userkey));
    }

    @Then("verifico que ingreso correctamente")
    public void verificoQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Validate.sessionStarted(), Matchers.equalTo("PRODUCTOS")));
    }
}
