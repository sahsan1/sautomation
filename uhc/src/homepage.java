import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
    public static void main(String[] args) throws InterruptedException {

        //to know the location of the chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/syedahsan/Downloads/chromedriver");

        //this is to open the chrome browser
        WebDriver driver = new ChromeDriver();

        //this is to visit the webpage
        driver.get("https://uhc-stg.uhc.com/feature-library");

        searchPage searchPage = new searchPage();
        searchPage.searchWord(driver);

        //quit the browser
        driver.quit();

    }
    }
