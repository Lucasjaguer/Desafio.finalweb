package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Waits {
    WebDriver driver;

    private static final Duration MAX_DURATION = Duration.ofSeconds(30L);

    private static final Duration POOL_DURATION = Duration.ofSeconds(3L);

    public Waits(WebDriver driver) { this.driver = driver;}

    public WebElement waitVisibility(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitClickable(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
