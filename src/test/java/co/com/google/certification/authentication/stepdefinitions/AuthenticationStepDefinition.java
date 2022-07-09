package co.com.google.certification.authentication.stepdefinitions;

import co.com.google.certification.authentication.exceptions.AuthenticationException;
import co.com.google.certification.authentication.models.Credentials;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.google.certification.authentication.exceptions.AuthenticationException.THE_AUTHENTICATION_WAS_FAILED;
import static co.com.google.certification.authentication.interactions.commons.OpenTheBrowser.navigateForGoogle;
import static co.com.google.certification.authentication.questions.authentication.SuccessAuthentication.theVerificationWasSuccessForAuthentication;
import static co.com.google.certification.authentication.tasks.Authenticate.authenticateWith;
import static co.com.google.certification.authentication.tasks.NavigateTo.visitSauceLabPagWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AuthenticationStepDefinition {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());

    }

    @Given("^(.*)user is going to SauceLab web$")
    public void userIsGoingToSauceLabWeb(String actor) {
        theActorCalled(actor).wasAbleTo(visitSauceLabPagWeb());

    }

    @When("^user tries to login with the next information$")
    public void userTriesToLoginWithTheNextInformation(List<Credentials> data) {
        theActorInTheSpotlight().attemptsTo(authenticateWith(data.get(0)));

    }

    @Then("^user verifies is success login$")
    public void userVerifiesIsSuccessAuthenticationWasSuccessful()  {
        theActorInTheSpotlight().should(seeThat(theVerificationWasSuccessForAuthentication()).orComplainWith(AuthenticationException.class,THE_AUTHENTICATION_WAS_FAILED));

    }

}
