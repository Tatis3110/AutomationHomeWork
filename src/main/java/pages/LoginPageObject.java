package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends BasePage{

    private final By loginField = By.id("login_field");
    private final By passwordField = By.id("password");
    private final By signInButton = By.name("commit");
    private final By errorMessage = By.xpath("//div[@id = 'login']/p");


    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public LoginPageObject login(String login,String password){
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signInButton).click();
        return new LoginPageObject(driver);

    }
public LoginPageObject validateErrorMessage(String message){
       Assert.assertEquals(message, driver.findElement(errorMessage).getText());
       return this;
}
public LoginPageObject returnToLoginPage(){
        driver.navigate().back();
                return new LoginPageObject(driver);

}


    public LoginPageObject chekAuthFields() {
        Assert.assertTrue("Field Login is hidden", this.driver.findElement(loginField).isDisplayed());
        Assert.assertTrue("Field Password is hidden", this.driver.findElement(passwordField).isDisplayed());
        Assert.assertTrue("signInButton is hidden", this.driver.findElement(signInButton).isDisplayed());
return this;

    }

}
