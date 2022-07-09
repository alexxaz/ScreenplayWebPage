package co.com.google.certification.authentication.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target USERNAME_INPUT = Target.the("username field input").located(By.id("user-name"));
    public static final Target PASSWORD_INPUT = Target.the("password field input").located(By.id("password"));
    public static final Target LOGIN_INPUT = Target.the("Authentication button").located(By.id("login-button"));
}
