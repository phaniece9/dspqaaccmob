package com.accura.dsp.tasks;

import com.accura.dsp.steps.StepLandingScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeLocationTask implements Task {
    public String zipcode="";

    public ChangeLocationTask(String zipcode)
    {
        this.zipcode=zipcode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StepLandingScreenElements.zip_code),
                SendKeys.of(this.zipcode).into(StepLandingScreenElements.zip_code),
                Click.on(StepLandingScreenElements.submit_location));

    }
    public static ChangeLocationTask changeLocationTask(String zipcode)
    {
        return instrumented(ChangeLocationTask.class, zipcode);
    }
}
