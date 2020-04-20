import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class switchtoAlert {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");

        //this clicks the alert button
        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        alertbutton.click();

        //this switches the focus to the alert and click on accept
        Alert alert = driver.switchTo().alert();

        alert.accept();

        driver.quit();
    }
}
