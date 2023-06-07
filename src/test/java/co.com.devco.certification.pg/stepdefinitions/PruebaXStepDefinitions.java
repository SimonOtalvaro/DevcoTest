package co.com.devco.certification.pg.stepdefinitions;

import co.com.devco.certification.pg.questions.Validation;
import co.com.devco.certification.pg.tasks.EnterRichText;
import co.com.devco.certification.pg.utils.Chrome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;


public class PruebaXStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
    }


    @Given("^that the user is logged in the web$")
    public void that_the_user_is_logged_in_the_web() {
        OnStage.theActorCalled("User").can(BrowseTheWeb.with(Chrome.in().pruebaX()));
    }

    @When("^The user enter the note whit rich text$")
    public void theUserEnterTheNoteWhitRichText() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterRichText.enter());
    }


    @Then("^The user see the note whit rich text saved$")
    public void theUserSeeTheNoteWhitRichTextSaved() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validation.ok()));
    }


}
