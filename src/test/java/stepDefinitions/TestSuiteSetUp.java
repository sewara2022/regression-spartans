package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


@CucumberOptions(
            features = {"src/test/features"},
            glue = {"stepDefinitions"},
            tags = "@regression",
            plugin = { "pretty", "html:target/cucumber-reports.html" }
    )

    public class TestSuiteSetUp extends AbstractTestNGCucumberTests {
        public static WebDriver driver;

        @Before
    public void setUp(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
        }

        @After
    public void tearDown(){
            driver.quit();
        }
    }

