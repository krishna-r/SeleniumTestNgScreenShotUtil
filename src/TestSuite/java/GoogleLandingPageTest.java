import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleLandingPageTest extends BaseTest {
    @org.testng.annotations.Test

    public void GoogleSearch() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Stay signed out']")));
        WebElement iframe=driver.findElement(By.xpath("//iframe[@role='presentation']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@aria-label='Stay signed out2']")).click();

        Thread.sleep(3000);



    }
    @Test
    public void GmailPage() throws InterruptedException {
        driver.get("https://www.google.com/intl/en-US/gmail/about/");
        Thread.sleep(3000);

    }

}
