package com.accura.dsp.tasks;

import com.accura.dsp.steps.StepLandingScreenElements;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Menuclicktask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

      actor.attemptsTo(Click.on((WebElementFacade) StepLandingScreenElements.menuclick));
    }
    public static  Menuclicktask menuclicktask()
    {
        return instrumented(Menuclicktask.class);
    }


}
