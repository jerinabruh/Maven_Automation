package Day7_031823;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_SelectDropdownByClick {
    public static void main(String[] args) throws InterruptedException {
        //set up driver through web manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver for automation testing
        WebDriver driver = new ChromeDriver();

        //set up your chrome options arguments for web driver *NEW*
        ChromeOptions options = new ChromeOptions();
        //add maximize screen for windows
        options.addArguments("full-screen");
        //add incognito mode to option
        options.addArguments("Incognito");

        //navigate to mortgage calc page
        driver.navigate().to("https://www.mortgagecalculator.org");

        //wait 2 sec
        Thread.sleep(2000);

        //select start month as april from dropdown using Select functions
        //if the dropdown is not under select tag then click on the dropdown first
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        //click on the dropdown value by using xpath text
        driver.findElement(By.xpath("//*[text()='Apr']")).click();

        //click on empty area to close the dropdown
        driver.findElement(By.xpath("//*[@class='content-area']")).click();

    }//end of main
}//end of class
