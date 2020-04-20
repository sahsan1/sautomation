import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;

public class planPage {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://uhc-stg.uhc.com/feature-library/plan-finder");

        WebElement zipcode= driver.findElement(By.id("2087421121"));
        Actions actions = new Actions(driver);
        actions.moveToElement(zipcode);

        zipcode.click();
        zipcode.sendKeys("60076");
        zipcode.submit();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();
    }
}
