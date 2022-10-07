package project.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utils.Driver;
import project.utils.Helper;

public class BasketPage {
    public BasketPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "removeCartItemBtn0-key-0")
    public WebElement deleteProduct;

    @FindBy(css = ".m-empty__messageBtn")
    public WebElement continueShoppingButton;


    public void deleteProduct() {
        Helper.waitFor(2);
        Helper.waitForElement(deleteProduct);
        deleteProduct.click();
    }

    public void verifyBasketEmpty() {
        Helper.waitFor(2);
        Helper.waitForElement(continueShoppingButton);
        Assert.assertTrue(continueShoppingButton.isDisplayed());
    }
}
