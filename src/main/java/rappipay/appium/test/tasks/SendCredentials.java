package rappipay.appium.test.tasks;


import java.util.logging.Level;
import java.util.logging.Logger;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.actions.Enter;
import rappipay.appium.test.userinterfaces.LoginPage;

public class SendCredentials implements Task {

    private String username;
    private String userkey;

    public SendCredentials(String username, String userkey) {
        this.username = username;
        this.userkey = userkey;
    }
    public static SendCredentials writeCredenciales(String username, String userkey) {
        return Tasks.instrumented(SendCredentials.class, username, userkey);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement loginButton = BrowseTheWeb.as(actor).getDriver()
                .findElement(AppiumBy.accessibilityId("test-LOGIN"));

        Logger.getAnonymousLogger().log(Level.INFO,("Ingreso  Credenciales"));
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.TXT_USUARIO),
                Enter.theValue(userkey).into(LoginPage.TXT_PASSWORD)
        );
        loginButton.click();

    }
}
