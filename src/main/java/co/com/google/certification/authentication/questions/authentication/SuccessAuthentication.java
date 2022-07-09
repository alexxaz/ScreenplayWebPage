package co.com.google.certification.authentication.questions.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.google.certification.authentication.userinterface.HomePage.TITLE_PRODUCTS_LABEL;

public class SuccessAuthentication implements Question<Boolean> {

    public static SuccessAuthentication theVerificationWasSuccessForAuthentication(){
        return new SuccessAuthentication();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TITLE_PRODUCTS_LABEL.resolveFor(actor).getText().equalsIgnoreCase("PRODUCTS");
    }
}
