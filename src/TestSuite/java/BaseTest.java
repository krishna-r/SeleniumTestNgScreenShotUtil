import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize ChromeDriver without setting the system property
        driver = new ChromeDriver();  // This will work if ChromeDriver is in your PATH
    }

    public WebDriver getDriver() {
        return driver;  // Method to access the WebDriver instance
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Quit the driver
        }
    }
}



