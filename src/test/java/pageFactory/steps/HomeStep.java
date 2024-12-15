package pageFactory.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageFactory.TestBase;
import pageFactory.tasks.HomeTask;

public class HomeStep extends TestBase {

    HomeTask homeTask = new HomeTask(getDriver());

    public HomeStep(){
    }

    /* CENÁRIO: Adicionar um item no carrinho de compras */

    @Dado("que clico na categoria monitores")
    public void clicoNaCategoriaMonitores(){
        homeTask.cliqueCategoriaMonitor();
    }
    @E("clico no produto escolhido")
    public void SelecionoProduto() {
        homeTask.selecionaProduto();
    }
    @E("clico em adicionar para o carrinho")
    public void adicionoAoCarrinho() {
        homeTask.adicionaParaCarrinho();
    }
    @E("valido a mensagem de confirmação")
    public void validoMensagemDeConfirmação() throws InterruptedException {
        homeTask.validaMensagemItem();
    }

    // CENÀRIO: finalizar venda checkout

    @E("que clico no menu de carrinho")
    public void clicoNoMenuDeCarrinho() {
        homeTask.clicarMenuCarrinho();
    }

    @E("clico em fazer pedido")
    public void clicoEmFazerPedido() {
        homeTask.FazerPedido();
    }

    @Dado("preencho os campos do formulário")
    public void preenchoDadosDeFormulário() {
        homeTask.preencherFormulario();
    }

    @Quando("clicar no botão comprar")
    public void clicoEmComprar() {
        homeTask.finalizar();
    }
    @Entao("deve exibir uma mensagem de sucesso")
    public void exibeMensagemDeSucesso() {

    }

}
