package co.com.google.certification.googlesearch.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.google.certification.googlesearch.interactions.commons.OpenTheBrowser.navigateForGoogle;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GoogleSearchInquiryStepDefinition {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());

    }

    @Given("^(.*) is in the google search$")
    public void userIsInTheGoogleSearch(String actor) throws Exception {
        theActorCalled(actor).wasAbleTo(navigateForGoogle());
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^user tries to search a word$")
    public void userTriesToSearchAWord(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }

    @Then("^user find the word$")
    public void userFindTheWord() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
