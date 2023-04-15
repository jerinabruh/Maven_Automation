package Week_4_HW_032223;

import Day9_032523.ReusableMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_AI04 {
    public static void main(String[] args) throws InterruptedException {

// on your test classes you still
        ReusableMethod reusableMethod;
        WebDriver driver = ReusableMethod.defineChromeDriver();

        //navigate to ups website
        driver.navigate().to("https://www.bestbuy.com/");

        //declare the explicit wait command
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //click on search bar
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceOfAllElementsLocatedBy is same as findElements
        ReusableMethod.clickMethod(driver,"//*[@id='gh-search-input']","Search Bar");

        //enter iphone in search bar
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='gh-search-input']"))).sendKeys("iPhone");

        //click on Search



    }// end of main

}//end of class

