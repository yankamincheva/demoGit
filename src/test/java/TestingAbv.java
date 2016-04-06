import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chris on 8/16/2015.
 */
public class TestingAbv {

    private WebDriver driver;


    @Before
    public void SetUp()
    {
        //Creating our WebDriver and setting up the needed timeout

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
    

    @After
    public void TearDown()
    {
        //Closing WebDriver
        driver.quit();
    }
}
