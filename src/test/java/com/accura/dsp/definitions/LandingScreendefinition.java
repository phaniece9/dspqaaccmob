package com.accura.dsp.definitions;

import com.accura.dsp.steps.StepLandingScreenElements;
import com.accura.dsp.tasks.Landingscreentask;
import com.accura.dsp.tasks.Menuclicktask;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import net.serenitybdd.annotations.Managed;
import net.thucydides.core.annotations.Managed;
//import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import net.serenitybdd.screenplay.ensure.Ensure;

public class LandingScreendefinition {
    @Managed(driver = "Appium")
    public WebDriver driver;
   //AppiumDriver driver;
    String actorName="honda";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^I open the URL$")
    public void iOpenTheURL() throws MalformedURLException, InterruptedException {
        actor.can(BrowseTheWeb.with(driver));
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", "true");

        //capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        //capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.get("https://www.acura.com/");*/
        actor.attemptsTo(Open.url("https://www.acura.com/"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);
    }

    /*@Then("verify the page title")
    public void verifyThePageTitle() {
    }*/

    @And("verify the accura logo")
    public void verifyTheAccuraLogo() {
        //Landingscreentask landingscreentask=new Landingscreentask();
        actor.attemptsTo(Ensure.that((Target) StepLandingScreenElements.verify_logo).isDisplayed());
    }

    @Then("verify the menu list present")
    public void verifyTheMenuListPresent() throws InterruptedException {
        //actor.attemptsTo(Menuclicktask.menuclicktask());
        driver.findElement(By.xpath("//span[contains(text(),'MENU')]")).click();
        Thread.sleep(5000);
        actor.attemptsTo(Ensure.that((Target) StepLandingScreenElements.verifymenulist).isDisplayed());

    }
}
