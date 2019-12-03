import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstProductPage {

    private WebDriver driver;

    public FirstProductPage(WebDriver driver) {
        this.driver = driver;

        By producttypecontains = By.xpath("//div[@class='active']//a[contains(text(),'(телевизор)')]");


    }
}
    /* public FirstProductPage clickOnFirstSearchProduct(){
        driver.findElement(firstsearchProduct);
    }*/

    /*public void getNecessaryFieldText(){
        //By producttypecontains;
        driver.findElement(producttypecontains).getText();

    }*/

