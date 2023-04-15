package Day6_031223;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_WebElement {
    public static void main(String[] args) throws InterruptedException {
        //set up driver through web manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver for automation testing
        WebDriver driver = new ChromeDriver();

        //navigate to calculator home
        driver.navigate().to("https://www.mlcalc.com");


        Thread.sleep(2000);
        //scroll in to the calculate button and se that as the initial point of the page
        WebElement calculate = driver.findElement(By.xpath("//*[@value='Calculate']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",calculate);


    }//end of main
}//end of class
