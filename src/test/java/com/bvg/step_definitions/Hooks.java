package com.bvg.step_definitions;

import com.bvg.utilities.BrowserUtils;
import com.bvg.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void tearDownScenario() {
        Driver.closeDriver();
    }


    @After
    public void tearDownScenario(Scenario scenario) {
       /* System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");

*/
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtils.waitFor(5);
        Driver.closeDriver();

        System.out.println("Driver closed");
    }
}
