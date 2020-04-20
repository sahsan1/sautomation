import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/dropdown");

        WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownmenu.click();

        //the below would choose the datepicker option from the dropdown. Note here that I choose the xpath value because ID was not available
        //xpatch is available via right clicking on the inspect
        WebElement autoComplete = driver.findElement(By.xpath("/html/body/div/div/div/a[4]"));
        autoComplete.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
