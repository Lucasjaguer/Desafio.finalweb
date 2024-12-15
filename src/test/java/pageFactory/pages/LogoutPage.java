package pageFactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

    @FindBy(id = "logout2")
    public static WebElement navLogout;

    @FindBy(id = "login2")
    public static WebElement navLogin;

}
