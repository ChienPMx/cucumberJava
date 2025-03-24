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
                "html:target/cucumber-reports/TestRunnerCategoryCMS.html",
                "json:target/cucumber-reports/TestRunnerCategoryCMS.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@A"
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true) // Hoặc false nếu không cần chạy song song
        public Object[][] scenarios() {
                return super.scenarios();
        }
}