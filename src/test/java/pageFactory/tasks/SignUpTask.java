package pageFactory.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageFactory.pages.SignUpPage;
import utils.Waits;

import static org.junit.Assert.assertEquals;

public class SignUpTask extends SignUpPage{
    private WebDriver driver;
    private Waits waits;

    public SignUpTask(WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
    }

    public void clicarEmSignUp(){
        signUp.click();
    }

    public void digitarUmNome(){
        waits.waitVisibility(inputNameSignup).sendKeys("Lucas Rieger");
    }

    public void digitarUmaSenha(){
        waits.waitVisibility(inputSecret).sendKeys("54321");
    }

    public void clicarFinalizarSignUp(){
        SignUpPage.buttonSignUp.click();
    }

    public void exibeMensagemDeSucesso() throws InterruptedException {
        Thread.sleep(3000);
        try {
            Alert alert = driver.switchTo().alert();
            String text = alert.getText();
            if (text == "Sign up successful."){
                assertEquals("Sign up successful.", text);
            } else if (text == "This user already exist.") {
                assertEquals("Sign up successful.", text);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
