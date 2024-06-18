package com.accura.dsp.tasks;

import com.accura.dsp.steps.StepLandingScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickLocationTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepLandingScreenElements.change_location));
    }
    public static ClickLocationTask clickLocationTask()
    {
        return instrumented(ClickLocationTask.class);
    }
}
