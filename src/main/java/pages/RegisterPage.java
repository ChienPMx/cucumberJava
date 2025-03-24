package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("username"); // Adjust IDs as per actual site
    By email = By.id("email");
    By password = By.id("password");
    By confirmPassword = By.id("confirm");
    By receiveEmails = By.id("receive_emails");
    By registerButton = By.xpath("//button[@type='submit']");

    public void fillForm(String user, String mail, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
        driver.findElement(receiveEmails).click();
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }
}
