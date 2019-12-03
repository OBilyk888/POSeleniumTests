import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private By searchfield = By.xpath("//input[@id='searchbox']");
    private By searchbutton = By.xpath("//input[@id='doSearch']");
    private By wrongTextInSearchField = By.xpath("//div[@class='item-notice']");

    public MainPage typeTextInSearchField(String productName){
        driver.findElement(searchfield).click();
        this.typeTextInSearchField(productName);
        driver.findElement(searchfield).sendKeys("productName" + Keys.ENTER);
        return this; // ? check it
    }
    public ProductsPage clickOnSearchButton(String productName){
        this.typeTextInSearchField(productName);
        driver.findElement(searchfield).sendKeys("телевизоры" + Keys.ENTER);
        driver.findElement(searchbutton).click();
        return new ProductsPage(driver);
    }
    /*public MainPage searchWithInvalidText (String productName){
        this.typeTextInSearchField(productName);
        driver.findElement(searchbutton).click();
        return new ProductsPage(driver);*/

    }
    /*private String getwrongTextInSearchField{
        return driver.findElement(wrongTextInSearchField).getText();
    }*/









