package co.com.devco.certification.pg.stepdefinitions;

import co.com.devco.certification.pg.utils.Chrome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
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


}
