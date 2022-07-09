package co.com.google.certification.authentication.tasks;

import co.com.google.certification.authentication.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {

    private LoginPage loginPage;

    public static NavigateTo visitSauceLabPagWeb() {
        return Tasks.instrumented(NavigateTo.class);
    }
  //  public static consultWithTheNext(){
  //      return Tasks.instrumented(LoginPage.class,word);

//    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
    }
}
