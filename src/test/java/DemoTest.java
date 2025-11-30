import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    void openGoogleChrome() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }

    @Test
    void openAmazonFirefox() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in");
        assertTrue(driver.getTitle().toLowerCase().contains("amazon"));
        driver.quit();
    }

    @Test
    void openFlipkartEdge() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com");
        assertTrue(driver.getTitle().toLowerCase().contains("flipkart"));
        driver.quit();
    }
}

