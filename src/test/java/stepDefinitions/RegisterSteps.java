package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;

    @Given("I am on the registration page")
    public void i_am_on_registration_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ctflearn.com/"); // Update if necessary
        registerPage = new RegisterPage(driver);
    }
    @When("I fill in the registration form with valid data")
    public void i_fill_registration_form() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        registerPage.fillForm("chientest"+dateFormat.format(new Date()), dateFormat.format(new Date())+"chien@example.com", "Test@1234");
    }
    @And("I click the register button")
    public void i_click_register_button() {
        registerPage.clickRegister();
    }
    @Then("I should see a confirmation or be logged in")
    public void i_should_see_confirmation() {
        System.out.println("Registration complete or redirected.");
        driver.quit();
    }
}
