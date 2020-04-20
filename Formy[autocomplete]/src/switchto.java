import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchto {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");

        WebElement opennewTab = driver.findElement(By.id("new-tab-button"));
        opennewTab.click();

        String originalHandle = driver.getWindowHandle();

        //this will switch the handle to the new tab that is open
        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        //this will be keep the original tab handle open... removing it will keep the handle on the new tab
        driver.switchTo().window(originalHandle);

    }
}
