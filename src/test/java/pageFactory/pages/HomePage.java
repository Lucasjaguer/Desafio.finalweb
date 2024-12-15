package pageFactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "(//a[@id='itemc'])[3]")
    public static WebElement catMonitors;

    @FindBy(xpath = "//a[contains(text(),'Apple')]")
    public static WebElement getProduct;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    public static WebElement addToCart;

    @FindBy(id = "cartur")
    public static WebElement navCart;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    public static WebElement clickPlaceOrder;

    @FindBy(id = "name")
    public static WebElement inputFormName;

    @FindBy(id = "country")
    public static WebElement inputFormCountry;

    @FindBy(id = "city")
    public static WebElement inputFormCity;

    @FindBy(id = "card")
    public static WebElement inputFormCard;

    @FindBy(id = "month")
    public static WebElement inputFormMonth;

    @FindBy(id = "year")
    public static WebElement inputFormYear;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    public static WebElement btnPurchase;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public static WebElement getBtnFinish;

}
