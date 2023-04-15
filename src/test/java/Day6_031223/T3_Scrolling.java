package Day6_031223;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Scrolling {
    public static void main(String[] args) throws InterruptedException {
        //set up driver through web manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver for automation testing
        WebDriver driver = new ChromeDriver();

        //navigate to google home
        driver.navigate().to("https://www.mlcalc.com");


        Thread.sleep(2000);

        //scroll to bottom to click on mortgage rate
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll using pixels
        jse.executeScript("scroll(0,3000)");

        Thread.sleep(1000);

        //scrolling back up again
        jse.executeScript("scroll(0,3000)");

        Thread.sleep(1500);

        //scroll down again using pixels
        jse.executeScript("scroll(0,3000)");

        //click on mortgage rate link
        driver.findElements(By.xpath("//a[text()='Mortgage Rates']")).get(1).click();


    }//end of main
}//end of class
