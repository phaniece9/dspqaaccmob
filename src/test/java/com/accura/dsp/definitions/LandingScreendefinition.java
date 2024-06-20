package com.accura.dsp.definitions;

import com.accura.dsp.steps.StepLandingScreenElements;
import com.accura.dsp.tasks.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

//import net.serenitybdd.annotations.Managed;
//import net.serenitybdd.annotations.Managed;
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
        actor.attemptsTo(Open.url("https://AHM%5CUAT_AHM:xGgW8Ssb@akamai-staging2.acura.com/"));
        //https://AHM%5CUAT_AHM:xGgW8Ssb@akamai-staging2.acura.com/
        //zdxtest42+alvaradorubia@gmail.com", "Tekion@123
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Thread.sleep(7000);
    }

    /*@Then("verify the page title")
    public void verifyThePageTitle() {
    }*/

    /*@And("verify the accura logo")
    public void verifyTheAccuraLogo() {
        //Landingscreentask landingscreentask=new Landingscreentask();
        actor.attemptsTo(Ensure.that((Target) StepLandingScreenElements.verify_logo).isDisplayed());
    }*/

    @Then("verify the menu list present")
    public void verifyTheMenuListPresent() throws InterruptedException {
        //actor.attemptsTo(Menuclicktask.menuclicktask());
        //driver.findElement(By.xpath("//span[contains(text(),'MENU')]")).click();
        Thread.sleep(5000);
        actor.attemptsTo(Ensure.that((Target) StepLandingScreenElements.verifymenulist).isDisplayed());

    }

    @When("I am on the landing screen")
    public void iAmOnTheLandingScreen() throws InterruptedException {
        actor.attemptsTo(Menuclicktask.menuclicktask());
        Thread.sleep(5000);
        actor.attemptsTo(Ensure.that((Target) StepLandingScreenElements.verifymenulist).isDisplayed());
    }

    @Then("I change the location")
    public void iChangeTheLocation() throws InterruptedException {
        actor.attemptsTo(ClickLocationTask.clickLocationTask());
        actor.can(BrowseTheWeb.with(driver));
       actor.attemptsTo(ChangeLocationTask.changeLocationTask("90703"));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
       Thread.sleep(5000);
        
    }

    @Then("Verify Location is changed")
    public void verifyLocationIsChanged() throws InterruptedException {
     //actor.attemptsTo(Ensure.that((Target)StepLandingScreenElements.changed_location).hasText("90703"));
    //Assertions.assertEquals("90703",
            //StepLandingScreenElements.changed_location.getCssOrXPathSelector(),"Location is Changed to 90703");
        //Assertions.assertEquals("90703",StepLandingScreenElements.changed_location.equals("90703"),"Location is changed to 90703");
        //actor.attemptsTo(Menuclicktask.menuclicktask());
        //Thread.sleep(5000);
        //actor.attemptsTo(Menuclicktask.menuclicktask());
        Thread.sleep(6000);
        //Assertions.assertEquals("90703",StepLandingScreenElements.changed_location,"Location is changed to 90703");
        //actor.should(seeThat((Question<Boolean>) StepLandingScreenElements.changed_location));
        String currentcode=driver.findElement(By.xpath("//span[@class='acr-nav-geo__location-zip acr-caption-10 js-current-zip']")).getText();
        Assertions.assertEquals("90703",currentcode,"Location is changed to 90703");
        actor.attemptsTo(Ensure.that((Target) StepLandingScreenElements.changed_location).isDisplayed());

        //System.out.println(driver.findElement(By.xpath("//span[@class='acr-nav-geo__location-zip acr-caption-10 js-current-zip']")).getText());
    }

    @Then("Navigate to Vehicle search page")
    public void navigateToVehicleSearchPage() throws InterruptedException {
    actor.attemptsTo(ClickShoppingToolsTask.clickShoppingToolsTask());
        Thread.sleep(5000);
    actor.attemptsTo(SearchInventoryTask.searchInventoryTask());

    }
}
