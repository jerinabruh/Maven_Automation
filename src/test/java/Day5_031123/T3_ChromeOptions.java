package Day5_031123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_ChromeOptions {
    public static void main(String[] args) throws InterruptedException {

        //setup driver thru web driver manager
        WebDriverManager.chromedriver().setup();

        //set up your chrome options arguments for web driver *NEW*
        ChromeOptions options = new ChromeOptions();
        //add maximize screen for windows
        options.addArguments("full-screen");
        //add incognito mode to option
        options.addArguments("Incognito");
        //add options to run your driver in the background (headless)
        options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo home page
        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(2000);

        //click on sign in link
        driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();

        Thread.sleep(2000);

        //print out sign in to yahoo text
        String result =  driver.findElement(By.xpath("//*[contains(@class,'heading')]")).getText();
        System.out.println("Result: " + result);


    }//end of main


}//end of class
