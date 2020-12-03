package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  extends BasePage{

    @FindBy(id = "login_field")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private WebElement signInButton;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void chekAuthFields(){
        Assert.assertTrue("Field Login is hidden", loginField.isDisplayed());
        Assert.assertTrue("Field Password is hidden", passwordField.isDisplayed());
        Assert.assertTrue("signInButton is hidden", signInButton.isDisplayed());

    }

}
