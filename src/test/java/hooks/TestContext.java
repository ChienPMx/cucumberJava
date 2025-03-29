package hooks;

import driver.DriverFactory;
import driver.DriverManager;
import utils.LogUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import pages.RegisterPage;
public class TestContext {

    private WebDriver driver;
    private RegisterPage registerPage;

    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver());
        LogUtils.info("Driver in TestContext: " + getDriver());
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}
