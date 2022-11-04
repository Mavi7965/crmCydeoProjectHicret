package com.crm.stepDefinitions;

import com.crm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After  // !!! executes after each scenario
    public void teardownScenario(Scenario scenario){

        //if scenario fails the method will return TRUE and take a screenshot.
        if(scenario.isFailed()){
            byte [] screenshot= ((TakesScreenshot) Driver.getDriver()) .getScreenshotAs(OutputType.BYTES);  // we used downcasting
            scenario.attach(screenshot, "image/png", scenario.getName());
        }




        Driver.closeDriver();
        //System.out.println("=====Closing browser using cucumber @After");
        //System.out.println("=====Scenario ended/ Take screenshot if failed");

    }


}
