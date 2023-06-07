package co.com.devco.certification.pg.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.pg.userinterfaces.NotePage.*;
import static co.com.devco.certification.pg.userinterfaces.NotePage.INPUT_NAME2;

public class EnterRichText implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_RICH_NOTE),
                WaitUntil.the(BUTTON_BOLD,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_BOLD),
                Enter.theValue(" Esto es una prueba para Devco").into(INPUT_TEXT),
                Click.on(BUTTON_SAVE)
        );
        actor.remember("NameInput",INPUT_NAME.resolveFor(actor).getText());
        actor.remember("NameNote",INPUT_NAME2.resolveFor(actor).getText());
    }

    public static EnterRichText enter(){
        return Tasks.instrumented(EnterRichText.class);
    }


}

