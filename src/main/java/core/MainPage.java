package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage {
    private By searchfield = By.xpath("//input[@id='searchbox']");
    private By searchbutton = By.xpath("//input[@id='doSearch']");
    private By wrongTextInSearchField = By.xpath("//div[@class='item-notice']");

    public MainPage typeTextInSearchField(String productName){
        DriverManager.getDriver().findElement(searchfield).click();
        this.typeTextInSearchField(productName);
        DriverManager.getDriver().findElement(searchfield).sendKeys("productName" + Keys.ENTER);
        return this; // ? check it
    }
    public ProductsPage clickOnSearchButton(String productName){
        this.typeTextInSearchField(productName);
        DriverManager.getDriver().findElement(searchfield).sendKeys("телевизоры" + Keys.ENTER);
        DriverManager.getDriver().findElement(searchbutton).click();
        return new ProductsPage();
    }
    /*public core.MainPage searchWithInvalidText (String productName){
        this.typeTextInSearchField(productName);
        getDriver().findElement(searchbutton).click();
        return new core.ProductsPage(getDriver());*/

    }
    /*private String getwrongTextInSearchField{
        return getDriver().findElement(wrongTextInSearchField).getText();
    }*/









