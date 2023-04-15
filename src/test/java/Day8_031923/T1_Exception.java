package Day8_031923;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Exception {
    public static void main(String[] args) throws InterruptedException {

        //using try catch for each element to handle your errors

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
        //clear and enter a home value
        try{
            WebElement homeVal = driver.findElement(By.xpath("//*[@name='param[homevalue]']"));
            homeVal.clear();
            homeVal.sendKeys("350000");
            System.out.println("Successfully entered Home Value on the field");
        }catch (Exception e) {
            System.out.println("Unable to enter a value on Home Value field. " + e);
        }//end of exception for home value

        //clear and enter a interest rate
        try{
            WebElement interestRate = driver.findElement(By.xpath("//*[@name='param[interest_rate]']"));
            interestRate.clear();
            interestRate.sendKeys("2.5");
            System.out.println("Successfully entered Interest Rate on the field");
        }catch (Exception e) {
            System.out.println("Unable to enter a value on Interest Rate field. " + e);
        }//end of exception for interest rate

        //select start month
        try{
            WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
            Select dropDown = new Select(strMonth);
            dropDown.selectByVisibleText("Apr");
            System.out.println("Successfully selected Month from the dropdown");
        }catch (Exception e) {
            System.out.println("Unable to select a value Start Month drop down. " + e);
        }//end of exception for start month


    }//end of main
}//end of class
