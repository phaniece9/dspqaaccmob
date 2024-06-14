package com.accura.dsp.runner;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import java.io.IOException;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com.accura.dsp.definitions"
)
/*
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.acura.dsp.definitions")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
*/


public class TestRunner {
    /*static AppiumDriverLocalService appiumService = null;

    @BeforeClass
    public static void startAppiumServer() throws IOException {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        //   appiumService.start();
    }

    @AfterClass
    public static void stopAppiumServer() {
        //   appiumService.stop();
    }*/
}
