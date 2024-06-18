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

    public static Target change_location= Target.the("change location")
            .located(By.xpath("//span[contains(text(),'Your Location')]"));

    public static Target zip_code=Target.the("Enter zipcode")
            .located(By.name("zipcode"));
    public static Target submit_location= Target.the("Submit")
            .located(By.xpath("(//button[@class='acr-nav-geo__btn-submit'])"));

    public static Target changed_location=Target.the("Changed location")
            .located(By.xpath("//span[@class='acr-nav-geo__location-zip acr-caption-10 js-current-zip']"));
    //span[@class='acr-nav-geo__location-zip acr-caption-10 js-current-zip']
    //*[@id="navbarContent"]/div[1]/div[1]/button/span
    public static Target location_click=Target.the("Submit buttion")
            .located(By.xpath("(//button[@class='acr-nav-geo__btn-submit'])"));

    public static Target shopping_tools= Target.the("Shopping Tools")
            .located(By.xpath("//span[contains(text(),'SHOPPING TOOLS')]"));

    public static Target search_inventory= Target.the("Search Inventory")
            .located(By.xpath("//span[contains(text(),'Search Inventory')]"));


}
