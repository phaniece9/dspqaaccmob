package com.accura.dsp.steps;

import org.openqa.selenium.By;

//import java.lang.annotation.Target;
import net.serenitybdd.screenplay.targets.Target;


public class StepLandingScreenElements  {

    public static Target verify_logo= Target.the("Verify logo")
            .located(By.xpath("//a[@class='acr-nav__logo-link']"));
    public static Target menuclick=Target.the("Menu Click")
            .located(By.xpath("//span[contains(text(),'MENU')]"));
    public static Target verifymenulist=Target.the("Verify Menu Item")
            .located(By.xpath("//a[contains(.,'VEHICLES')]"));

}
