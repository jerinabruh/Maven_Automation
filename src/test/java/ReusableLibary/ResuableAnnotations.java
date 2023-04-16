package ReusableLibary;

import Day9_032523.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ResuableAnnotations {

    //you need to make your WebDriver driver variable static since we are calling it to our test class

    public static WebDriver driver;

    //set before suite annotation method
    @BeforeSuite
    public void setDriver(){
        driver = ReusableMethod.defineChromeDriver();

    }//end of before suite

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }//end of after suite

    //test test github
}
