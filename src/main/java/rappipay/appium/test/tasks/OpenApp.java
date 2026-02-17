package rappipay.appium.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rappipay.appium.test.userinterfaces.LoginPage;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenApp implements Task {
    public static OpenApp launchApp() {
        return Tasks.instrumented(OpenApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().log(Level.INFO, "Abriendo la app de Pruebas");
        try {
            Thread.sleep(15000); // Esperar 5 segundos
            System.out.println("✅ App abierta");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
