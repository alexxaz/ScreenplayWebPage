package co.com.google.certification.authentication.tasks;

import co.com.google.certification.authentication.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.google.certification.authentication.interactions.authentication.Authenticate.authenticateWhitTheNext;
import static co.com.google.certification.authentication.userinterface.LoginPage.*;

public class Authenticate implements Task {

    private Credentials credentials;

    public Authenticate(Credentials credentials) {
        this.credentials = credentials;
    }

    public static Authenticate authenticateWith(Credentials credentials){
        return Tasks.instrumented(Authenticate.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(authenticateWhitTheNext(credentials));

/*        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(USERNAME_INPUT),
                Enter.theValue(credentials.getPassword()).into(PASSWORD_INPUT),
                Click.on(LOGIN_INPUT));*/

    }
}
