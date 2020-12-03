package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected static WebDriver driver;

    @Before
    public void setUp(){
        System.out.println(System.setProperty(
                "webdriver.chrome.driver",
                System.getProperty("user.dir") +
                        "/src/main/resources/drivers.chrome.v85/chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com/login");
    }

    @After
    public void tearDown(){

    }
}
