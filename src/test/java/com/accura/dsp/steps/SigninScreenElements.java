package com.accura.dsp.steps;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SigninScreenElements {
    public static Target my_account=Target.the("My Account")
            .located(By.xpath("//span[contains(text(),'MY ACCOUNT')]"));

    public static Target sign_in=Target.the("Sign in")
            .located(By.xpath("//span[contains(text(),'Sign In')]"));

    public static Target username=Target.the("Username")
                    .located(By.xpath("//input[@inputmode='email']"));

    public static Target password=Target.the("Password")
            .located(By.xpath("//input[@type='password']"));

    public static Target Sigin_button=Target.the("Submit")
            .located(By.xpath("//button[contains(text(), 'Sign In')]"));

    public static Target Sign_out=Target.the("Sign Out")
            .located(By.xpath("//span[contains(text(),'Sign Out')]"));
}
