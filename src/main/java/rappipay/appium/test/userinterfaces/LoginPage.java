package rappipay.appium.test.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target TXT_USUARIO = Target.the("Caja de texto Usuario")
            .located(AppiumBy.accessibilityId("test-Usuario"));

    public static Target TXT_PASSWORD = Target.the("Caja de texto Contraseña")
            .located(AppiumBy.accessibilityId("test-Contraseña"));

    public static Target BTN_LOGIN = Target.the("Bton iniciar sesion")
            .located(AppiumBy.accessibilityId("test-LOGIN"));


    public static final Target LBL_PRODUCTOS = Target.the("Label Productos")
            .locatedForAndroid(AppiumBy.androidUIAutomator("new UiSelector().text(\"PRODUCTOS\")"))
            .locatedForIOS(AppiumBy.iOSNsPredicateString("label == 'PRODUCTOS'"));
}
