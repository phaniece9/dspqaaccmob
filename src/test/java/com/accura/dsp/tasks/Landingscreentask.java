package com.accura.dsp.tasks;

import com.accura.dsp.definitions.LandingScreendefinition;
import com.accura.dsp.steps.StepLandingScreenElements;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Landingscreentask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo((Performable) StepLandingScreenElements.verify_logo);
        //Click.on((WebElementFacade) StepLandingScreenElements.menuclick);
        actor.attemptsTo((Performable) StepLandingScreenElements.verifymenulist);




    }


}
