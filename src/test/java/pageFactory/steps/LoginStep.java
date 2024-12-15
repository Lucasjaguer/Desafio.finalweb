package pageFactory.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pageFactory.TestBase;
import pageFactory.tasks.LoginTask;

public class LoginStep extends TestBase {

    LoginTask loginTask = new LoginTask(getDriver());

    public LoginStep(){
    }

    @Dado("que clico no menu Log In")
    public void queClicoEmLogIn() throws Exception{
        loginTask.clicaMenuLogin();
    }

    @E("digito um usuário válido")
    public void digitoUsuarioValido() throws Exception{
        loginTask.digitaNomeValido();
    }
    @E("digito uma senha válida")
    public void digitUmaASenhaValida() throws Exception{
        loginTask.digitaSenhaValida();
    }
    @Quando("clico no botão Log in")
    public void clicoBotaoLogin() throws Exception{
        loginTask.clicaBotãoLogin();
    }
    @Entao("deve exibir nome logado")
    public void exibeNomeLogado() throws Exception{
        String nomeLogado = loginTask.validaNomeLogado();
        Assert.assertEquals("Welcome Lucas Rieger", nomeLogado);
    }
}
