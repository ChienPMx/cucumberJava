package hooks;

import driver.DriverFactory;
import driver.DriverManager;
import utils.LogUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;


    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver());
        LogUtils.info("Driver in TestContext: " + getDriver());
    }



    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}
