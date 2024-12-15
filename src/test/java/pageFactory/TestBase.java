package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    protected static WebDriver driver;

    public static WebDriver startDriver(){
        System.out.println("Iniciando o ChromeDriver...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.setCapability("unhandledPromptBehavior", "accept");
        driver = new ChromeDriver(options);
        System.out.println("ChromeDriver iniciado com sucesso.");
        return driver;
    }

    public static WebDriver getDriver(){
        if(driver == null){
            driver = startDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            System.out.println("Encerrando o ChromeDriver...");
            driver.quit();
            driver = null;
            System.out.println("ChromeDriver encerrado com sucesso.");
        }
    }

}
