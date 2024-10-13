import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils; // Make sure to include Apache Commons IO dependency
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class ScreenshotExample {
    public void takeScreenshot(WebDriver driver) {
        // Take the screenshot and store it in a file
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Define the destination directory
        File destDir = new File(Paths.get(System.getProperty("user.dir"), "destDir").toString());
        
        // Create the destination file
        File destFile = new File(destDir, "screenshot.png");
        
        try {
            // Create the destination directory if it doesn't exist
            if (!destDir.exists()) {
                destDir.mkdirs();
            }
            // Copy the screenshot to the destination
            FileUtils.copyFile(src, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
