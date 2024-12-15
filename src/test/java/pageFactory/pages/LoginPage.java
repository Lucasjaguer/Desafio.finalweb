package pageFactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "nameofuser")
    public static WebElement nameLogin;

    @FindBy(id = "login2")
    public static WebElement navLogin;

    @FindBy(id = "loginusername")
    public static WebElement inputNameLogin;

    @FindBy(id = "loginpassword")
    public static WebElement inputSecretLogin;

    @FindBy(xpath = "//button[text()='Log in']")
    public static WebElement buttonLogin;
}