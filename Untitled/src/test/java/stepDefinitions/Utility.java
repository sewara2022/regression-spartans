package stepDefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.Instant;

import static stepDefinitions.TestSuiteSetUp.driver;

public class Utility {

    public static void testTakesScreenshot() throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target/screenshots/"+ Instant.now()+".png"));
    }

}
