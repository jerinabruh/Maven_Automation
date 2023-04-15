package Day11_040123;

import Day9_032523.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_GoogleSearchTestNG {
    //to make variable global, you must declare it outside the annotation methods
    WebDriver driver;
    //create before suite method to define chrome driver
    @BeforeSuite
    public void setUpDriver(){
        driver = ReusableMethod.defineChromeDriver();
    }//end of before suite

    //@Test is a replacement of the main method to execute your code
    @Test
    public void GoogleSearchNumber(){
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        //enter bmw in search field
        ReusableMethod.sendKeysMethod(driver,"//*[@name='q']", "BMW", "Search Field");
        //submit google search
        ReusableMethod.submitMethod(driver, "//*[@name='btnK']", "Google Search");
        //capture the text and print number
        String result = ReusableMethod.captureTextMethod(driver, "//*[@id='result-stats']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for BMW: " + arrayResult[1]);

    }//end of test

    //quit the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }

}//end of class
