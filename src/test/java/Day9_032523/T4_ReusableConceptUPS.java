package Day9_032523;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T4_ReusableConceptUPS { public static void main(String[] args) throws InterruptedException {

// on your test classes you still
    ReusableMethod reusableMethod;
    WebDriver driver = ReusableMethod.defineChromeDriver();

    //navigate to ups website
    driver.navigate().to("http://www.ups.com/us");

    //declare the explicit wait command
    WebDriverWait wait = new WebDriverWait(driver, 20);

    //click on shipping
    //your explicit wait condition replaces your driver.findElement(s)
    //presenceOfAllElementsLocatedBy is same as findElements
    ReusableMethod.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");

    //click on Schedule a Pickup
    //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
    Thread.sleep(2000);
    ReusableMethod.clickMethod(driver,"//*[text()='Schedule a Pickup']","Schedule a Pickup");


    //click on Freight
    ReusableMethod.clickMethod(driver,"//*[text()='Freight']","Freight");


}// end of main

}//end of class
