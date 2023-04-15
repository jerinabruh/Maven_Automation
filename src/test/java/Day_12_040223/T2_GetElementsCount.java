package Day_12_040223;

import ReusableLibary.ResuableAnnotations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static ReusableLibary.ResuableAnnotations.driver;

public class T2_GetElementsCount extends ResuableAnnotations { @Test
public void getNavListCount(){
    //navigating to USPS
    driver.navigate().to("https://www.usps.com");
    //store element list in an array list with common properties
    WebDriverWait wait = new WebDriverWait(driver,7);
    ArrayList<WebElement> navList = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]"))));
    System.out.println("Count: " + navList.size());
}//end of test

}//end of class
