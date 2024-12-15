package pageFactory.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pageFactory.TestBase;
import pageFactory.tasks.LogoutTask;

public class LogoutStep extends TestBase {

    LogoutTask logoutTask = new LogoutTask(getDriver());

    public LogoutStep(){

    }

    @Dado("que clico em Log out")
    public void queClicoEmLogout() throws Exception{
        logoutTask.clicaMenuLogout();
    }

    @Entao("deve exibir o menu de Log in")
    public void deveExibirMenuLogin() throws Exception {
        String menuLogin = logoutTask.validaMenulogin();
        Assert.assertEquals("Log in", menuLogin);
    }
}
