package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstProductPage {


    public FirstProductPage() {
        By producttypecontains = By.xpath("//div[@class='active']//a[contains(text(),'(телевизор)')]");


    }
}
    /* public core.FirstProductPage clickOnFirstSearchProduct(){
        driver.findElement(firstsearchProduct);
    }*/

    /*public void getNecessaryFieldText(){
        //By producttypecontains;
        driver.findElement(producttypecontains).getText();

    }*/

/*public void getNecessaryFieldText(){
        //By producttypecontains;
        driver.findElement(producttypecontains).getText();

    }*/