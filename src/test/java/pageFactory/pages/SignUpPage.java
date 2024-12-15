package pageFactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    @FindBy(id = "signInModalLabel")
    public static WebElement validateLabelSignup;

    @FindBy(id = "signin2")
    public static WebElement signUp;

    @FindBy(xpath = "//input[@id='sign-username']")
    public static WebElement inputNameSignup;

    @FindBy(xpath = "//input[@id='sign-password']")
    public static WebElement inputSecret;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
    public static  WebElement buttonSignUp;

}
