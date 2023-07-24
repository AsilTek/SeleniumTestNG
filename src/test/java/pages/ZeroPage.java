package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {

    public ZeroPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "signin_button")
    public WebElement signInButton;

    @FindBy(id = "user_login")
    public WebElement logInBox;

    @FindBy(id = "user_password")
    public WebElement passBox;

    @FindBy(name = "submit")
    public WebElement pressButton;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingMenuButton;

    @FindBy(id = "pay_bills_link")
    public WebElement payBills;

    @FindBy(partialLinkText = "Purchase Foreign Currency")
    public WebElement purchaseFC;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropDown;
}
