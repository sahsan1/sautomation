import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class scrolltoElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/scroll");

        //adding actions class will then let the webdriver to move the name element
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Baburao Ganpat Rao Apteeeewe");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2021");
        Thread.sleep(5000);

        driver.quit();




    }
}
