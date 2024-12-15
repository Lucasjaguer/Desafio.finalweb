package pageFactory.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageFactory.pages.LoginPage;
import utils.Waits;

public class LoginTask  extends LoginPage {
    private WebDriver driver;
    private Waits waits;

    public LoginTask(WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
    }

    public void clicaMenuLogin(){
        navLogin.click();
    }

    public void digitaNomeValido(){
        waits.waitVisibility(inputNameLogin).sendKeys("Lucas Rieger");
    }

    public void digitaSenhaValida(){
        waits.waitVisibility(inputSecretLogin).sendKeys("54321");
    }

    public void clicaBotãoLogin(){
        buttonLogin.click();
    }

    public String validaNomeLogado(){
        return waits.waitVisibility(nameLogin).getText();
    }

}
