package com.accura.dsp.tasks;

import com.accura.dsp.steps.SigninScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Signinbuttontask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SigninScreenElements.Sigin_button));
    }
    public static Signinbuttontask signinbuttontask()
    {
        return instrumented(Signinbuttontask.class);
    }
}
