import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
    public static void searchWord(WebDriver driver) throws InterruptedException {
        //this is to apply the focus on the search box by id
        WebElement element = driver.findElement(By.id("search"));

        //enter the search word
        element.sendKeys("Medicaid");

        //submit the search word and add 20 seconds wait once the page shows search results
        element.submit();
        Thread.sleep(2000);
    }
}
