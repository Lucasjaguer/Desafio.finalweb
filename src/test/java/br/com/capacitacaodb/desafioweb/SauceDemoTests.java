package br.com.capacitacaodb.desafioweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

@DisplayName("Tests Automatizados Projeto Web")
public class SauceDemoTests {
    @Test
    @DisplayName("login Username e Password")
    public void testLoginComUsuarioESenha() {
        //Abrir Navegador
        WebDriverManager.edgedriver().setup();
        WebDriver navegador= new EdgeDriver();

        //Abrir Site Saucedemo
    navegador.get("https://www.saucedemo.com");

        //Campo Login Username
        navegador.findElement(By.id("user-name")).click();
        //Digitar Username
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        //Digitar Password
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        //Botão Login
        navegador.findElement(By.id("login-button")).click();
        //Clicar botão para enviar produto carrinho
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        //Clicar Carrinho de compras
        navegador.findElement(By.className("shopping_cart_link")).click();
        //Finalizar compra
        navegador.findElement(By.id("checkout")).click();
        //Campo First Name
        navegador.findElement(By.id("first-name")).click();
        //Preencher Campo First Name
        navegador.findElement(By.id("first-name")).sendKeys("Lucas");
        //Last Name
        navegador.findElement(By.id("last-name")).click();
        //Preencher o Campo Last Name
        navegador.findElement(By.id("last-name")).sendKeys("Rieger");
        //Postal Code
        navegador.findElement(By.id("postal-code")).click();
        //Preencher Postal Code
        navegador.findElement(By.id("postal-code")).sendKeys("91530630");
        //Continue
        navegador.findElement(By.id("continue")).click();
        //Finish
        navegador.findElement(By.id("finish")).click();
        //Back Home
        navegador.findElement(By.id("back-to-products")).click();
        //Fim do Ciclo de compra
    }
}
