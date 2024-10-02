import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {
    WebDriver driver = null;

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        driver = ((BaseTest) testClass).getDriver(); // Assuming BaseTest has a method to get WebDriver
        ScreenshotUtil.captureScreenshot(driver, result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {}

    @Override
    public void onTestSuccess(ITestResult result) {}

    @Override
    public void onTestSkipped(ITestResult result) {}

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

    @Override
    public void onStart(ITestContext context) {}

    @Override
    public void onFinish(ITestContext context) {}
}
