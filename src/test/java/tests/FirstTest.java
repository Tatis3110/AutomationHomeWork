package tests;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;


import java.util.concurrent.TimeUnit;


public class FirstTest extends BaseTest {

private LoginPage page;

@Before
public void setPage(){
    page = new LoginPage(driver);

}
    @Test
    public void ourTest() {
        page = new LoginPage(driver);
        page.chekAuthFields();

    }


}
