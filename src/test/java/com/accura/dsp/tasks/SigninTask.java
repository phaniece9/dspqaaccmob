package com.accura.dsp.tasks;

import com.accura.dsp.steps.SigninScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SigninTask implements Task {

    private String username="";
    private String password="";

    public SigninTask(String username,String password)
    {
       this.username=username;
       this.password=password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SigninScreenElements.username),
                SendKeys.of(this.username).into(SigninScreenElements.username),
                Click.on(SigninScreenElements.password),
                SendKeys.of(this.password).into(SigninScreenElements.password)

        );

    }
    public static SigninTask signinTask(String username,String password)
    {
        return instrumented(SigninTask.class, username,password);
    }
}
