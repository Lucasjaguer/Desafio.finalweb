package pageFactory.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static pageFactory.TestBase.getDriver;
import static pageFactory.TestBase.quitDriver;

public class hook {
    @Before
    public void setUp(){
        getDriver().get("https://www.demoblaze.com");
    }

    @After
    public void finish(){
        quitDriver();
    }
}
