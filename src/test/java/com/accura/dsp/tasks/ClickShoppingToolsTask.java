package com.accura.dsp.tasks;

import com.accura.dsp.steps.StepLandingScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickShoppingToolsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepLandingScreenElements.shopping_tools));

    }
    public static ClickShoppingToolsTask clickShoppingToolsTask()
    {
        return instrumented(ClickShoppingToolsTask.class);
    }
}
