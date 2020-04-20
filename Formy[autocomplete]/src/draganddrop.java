import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class draganddrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        //the below creates the action to drag and drop from the image to the box
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();

        driver.quit();
    }
}
