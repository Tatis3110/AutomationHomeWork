package tests;

import org.junit.Before;
import org.junit.Test;
import pages.LoginPageObject;

public class LoginPageTest extends BaseTest{

    private LoginPageObject page;

    @Before
public void setPage(){
        this.page = new LoginPageObject(driver);
        this.errorMessage = "There have been several failed attempts to sign in " +
                "from this account or IP address. " +
                "Please wait a while and try again later.";
    }

    @Test
    public void  negativeAuthTest(){
page.chekAuthFields()
              page.login("admin", "admin")
              page.validateErrorMessage(errorMessage, True )
              page.returnToLoginPage()
                      page.login("login","passoword")
                      page.validateErrorMessage(errorMessage );
              )

    }
}
