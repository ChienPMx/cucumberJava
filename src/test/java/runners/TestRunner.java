package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {
                "stepDefinitions",
                "common",
                "hooks"
        },
        plugin = {
                "pretty",
                "html:target/cucumber-reports/TestRunner.html",
                "json:target/cucumber-reports/TestRunner.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@A"
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}