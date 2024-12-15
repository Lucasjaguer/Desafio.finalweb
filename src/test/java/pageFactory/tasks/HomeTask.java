package pageFactory.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageFactory.pages.HomePage;
import utils.Waits;

import static org.junit.Assert.assertEquals;

public class HomeTask extends HomePage {
    private WebDriver driver;
    private Waits waits;

    public HomeTask(WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
    }

    public void cliqueCategoriaMonitor(){
        waits.waitVisibility(catMonitors).click();
    }

    public void selecionaProduto(){
        waits.waitVisibility(getProduct).click();
    }

    public void adicionaParaCarrinho(){
        waits.waitVisibility(addToCart).click();
    }

    public void validaMensagemItem() throws InterruptedException {
        Thread.sleep(3000);
        try {
            Alert alert = driver.switchTo().alert(); // Troca para o alerta
            System.out.println("Texto do alerta: " + alert.getText()); // Opcional: Leia o texto
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Nenhum alerta presente.");
        }
    }

    public void clicarMenuCarrinho(){
        waits.waitVisibility(navCart).click();
    }

    public void FazerPedido(){
        waits.waitVisibility(clickPlaceOrder).click();
    }

    public void preencherFormulario(){
        waits.waitVisibility(inputFormName).sendKeys("Lucas Rieger");
        waits.waitVisibility(inputFormCountry).sendKeys("Brazil");
        waits.waitVisibility(inputFormCity).sendKeys("Porto Alegre");
        waits.waitVisibility(inputFormCard).sendKeys("9985641220215748");
        waits.waitVisibility(inputFormMonth).sendKeys("09");
        waits.waitVisibility(inputFormYear).sendKeys("2028");
    }

    public void finalizar(){
        waits.waitVisibility(btnPurchase).click();
    }

    public void MsgSucesso(){
        waits.waitVisibility(getBtnFinish).click();
    }

}
