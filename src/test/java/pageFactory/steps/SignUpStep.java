package pageFactory.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pageFactory.TestBase;
import pageFactory.tasks.SignUpTask;

public class SignUpStep extends TestBase {

    SignUpTask signUpTask = new SignUpTask(getDriver());

    public SignUpStep(){
    }

    @Dado("que estou na pagina inicial")
    public void queEstouNaPaginaInicial() throws Exception{
        Assert.assertTrue("Titulo é STORE", getDriver().getTitle().contains("STORE"));
    }

    @Dado("que clico no botão signup")
    public void queClicoNoBotãoSignup() throws Exception{
        signUpTask.clicarEmSignUp();
    }

    @Dado("digito um nome no campo name")
    public void digitoUmNomeNoCampoName() throws Exception{
        signUpTask.digitarUmNome();
    }

    @Dado("digito uma senha no campo password")
    public void digitoUmaSenhaNoCampoPassword() throws Exception{
        signUpTask.digitarUmaSenha();
    }

    @Quando("clico no botão signup")
    public void clicoNoBotãoSignup() throws Exception{
        signUpTask.clicarFinalizarSignUp();
    }

    @Entao("deve exibir um aviso de sucesso")
    public void deveExibirUmAvisoDeSucesso() throws Exception{
        signUpTask.exibeMensagemDeSucesso();
    }

}
