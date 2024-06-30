import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestInitialization {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        // Initialize the ChromeDriver
        driver=new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Navigate to the Sauce Demo login page
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
