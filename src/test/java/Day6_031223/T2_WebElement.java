package Day6_031223;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T2_WebElement {
    public static void main(String[] args) throws InterruptedException {
        //set up driver through web manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver for automation testing
        WebDriver driver = new ChromeDriver();

        //navigate to google home
        driver.navigate().to("https://www.mlcalc.com");

        Thread.sleep(2000);

        //clear the auto generated data from purchase price
        WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
        pPrice.clear();
        //enter new purch price
        pPrice.sendKeys(("250000"));

        //click on calculate
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(2000);


        //if you want to use findElements as a webElement variable, you need to store it as an ArrayList
        //capture the monthly payment & total 360
        ArrayList<WebElement> paymentList = new ArrayList<>(driver.findElements((By.xpath("//*[@style='font-size: 32px']"))));
        //print monthly payment
        String mntPayment = paymentList.get(0).getText();
        System.out.println("Monthly Payment: " + mntPayment);
        //print total 360  payment
        String total360Pay = paymentList.get(1).getText();
        System.out.println("Total 360 Payment: " + total360Pay);


    }//end of main
}//end of class
