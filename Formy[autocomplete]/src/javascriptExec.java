import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExec {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/modal");

        WebElement openmodal = driver.findElement(By.id("modal-button"));
        openmodal.click();

        //the below will execute the js and should click the close button on the modal
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);

        driver.quit();

    }

}
