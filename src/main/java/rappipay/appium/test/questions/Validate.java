package rappipay.appium.test.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rappipay.appium.test.userinterfaces.LoginPage;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Validate implements Question {
    public static Validate sessionStarted() {
        return new Validate();
    }

    @Override
    public Object answeredBy(Actor actor) {
        Logger.getAnonymousLogger().log(Level.INFO,("Valido sesión iniciada correctamente."));
        return Text.of(LoginPage.LBL_PRODUCTOS).answeredBy(actor);
    }
}
