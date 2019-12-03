import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;

        //private By firstsearchProduct = By.xpath("//li[@class='product-item promo-product']//img[@class='img-product']");
        //private By producttype = By.xpath("//div[@class='active']//tr[2]//td[1]");
    }

    public FirstProductPage firstsearchProduct (String productName){

        By firstsearchProduct = By.xpath("//li[@class='product-item promo-product']//img[@class='img-product']");
        driver.findElement(firstsearchProduct).click();
        return new FirstProductPage(driver);

    }


}
