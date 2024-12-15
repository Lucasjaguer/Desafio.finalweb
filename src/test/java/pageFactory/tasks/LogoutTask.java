package pageFactory.tasks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageFactory.pages.LogoutPage;
import utils.Waits;

public class LogoutTask extends LogoutPage {

    private WebDriver driver;
    private Waits waits;

    public LogoutTask(WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
    }

    public void clicaMenuLogout(){
        navLogout.click();
    }

    public String validaMenulogin(){
        return waits.waitVisibility(navLogin).getText();
    }



}
