package com.accura.dsp.tasks;

import com.accura.dsp.steps.StepLandingScreenElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionSubject;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Subject("the displayed todo items")
public class ChangedLocationTask implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String selectedValue = BrowseTheWeb.as(actor)
                .findBy(""+StepLandingScreenElements.changed_location)
                .getText();
        return String.valueOf(selectedValue);
    }



   /* @Override
    public <T extends Actor> void performAs(T actor) {
        String selectedValue = BrowseTheWeb.as(actor)
                .findBy(""+StepLandingScreenElements.changed_location)
                .getText();

    }
    public static ChangedLocationTask changedLocationTask()
    {
        return instrumented(ChangedLocationTask.class);
    }*/
}
