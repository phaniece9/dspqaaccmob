package com.accura.dsp.definitions;

import com.accura.dsp.steps.SigninScreenElements;
import com.accura.dsp.steps.StepLandingScreenElements;
import com.accura.dsp.tasks.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SigninScreendefinition {
    @Managed(driver = "Appium")
    public WebDriver driver;
    //AppiumDriver driver;
    String actorName="honda";
    Actor actor = Actor.named(actorName);
    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() throws InterruptedException {
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(Menuclicktask.menuclicktask());
        Thread.sleep(2000);
        actor.attemptsTo(MyaccountTask.myaccountTask());
        Thread.sleep(5000);
        actor.attemptsTo(SiginProfileTask.siginProfileTask());
        Thread.sleep(2000);
        actor.attemptsTo(SigninTask.signinTask("zdxtest42+alvaradorubia@gmail.com","Tekion@123"));
        Thread.sleep(4000);
      //actor.attemptsTo(Ensure.that(driver.navigate().back());
        //driver.navigate().back();
        //((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        actor.attemptsTo(Signinbuttontask.signinbuttontask());
        Thread.sleep(2000);
        actor.attemptsTo(Signinbuttontask.signinbuttontask());
    }

    @Then("the user should be signed in successfully")
    public void theUserShouldBeSignedInSuccessfully() throws InterruptedException {
        actor.attemptsTo(Menuclicktask.menuclicktask());
        actor.attemptsTo(MyaccountTask.myaccountTask());
        Thread.sleep(3000);
        actor.attemptsTo(Ensure.that((Target) SigninScreenElements.Sign_out).isDisplayed());
        Thread.sleep(5000);
        actor.attemptsTo(SignoutTask.signoutTask());
    }
}
