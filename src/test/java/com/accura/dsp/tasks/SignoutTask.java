package com.accura.dsp.tasks;

import com.accura.dsp.steps.SigninScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignoutTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SigninScreenElements.Sign_out));

    }
    public static SignoutTask signoutTask()
    {
        return instrumented(SignoutTask.class);
    }
}
