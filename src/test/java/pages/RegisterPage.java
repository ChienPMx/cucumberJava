package pages;

import org.openqa.selenium.By;

import static keywords.WebUI.clickElement;
import static keywords.WebUI.setText;

public class RegisterPage {




    By username = By.id("username"); // Adjust IDs as per actual site
    By email = By.id("email");
    By password = By.id("password");
    By confirmPassword = By.id("confirm");
    By receiveEmails = By.id("receive_emails");
    By registerButton = By.xpath("//button[@type='submit']");

    public void fillForm(String user, String mail, String pass) {
        setText(username, user);
        setText(email, mail);
        setText(password, pass);
        setText(confirmPassword, pass);
    }

    public void clickRegister() {
        clickElement(registerButton);
    }
}
