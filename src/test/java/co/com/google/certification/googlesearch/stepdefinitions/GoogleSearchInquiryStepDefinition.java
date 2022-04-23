package co.com.google.certification.googlesearch.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchInquiryStepDefinition {

    @Given("^user is in the google search$")
    public void userIsInTheGoogleSearch() throws Exception {
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
