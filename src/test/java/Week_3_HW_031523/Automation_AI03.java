package Week_3_HW_031523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI03 {
    public static void main(String[] args) throws InterruptedException {
        //create array list with three zip codes
        ArrayList<String> zipcodes = new ArrayList<>();
        zipcodes.add("11210");
        zipcodes.add("11010");
        zipcodes.add("10001");

        //iterate through the list of sports and print out search result number for each sport
        for (int i = 0; i < zipcodes.size(); i++) {

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
            //add options to run your driver in the background (headless)
            options.addArguments("headless");

            //navigate to ww link
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            Thread.sleep(2000);

            WebElement search = driver.findElement(By.xpath("//*[@class='input input-3TfT5']"));

            //clear search bar
            search.clear();

            //enter zip code into search field to begin ArrayList loop
            driver.findElement(By.xpath("//*[@class='input input-3TfT5']")).sendKeys(zipcodes.get(i));

            Thread.sleep(2000);

            //click on search button
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).submit();

            Thread.sleep(2000);

            //create WebElement ArrayList for the studio and address value
            ArrayList<WebElement> studio = new ArrayList<>(driver.findElements(By.xpath("//*[contains(text(),'WW Studio @ ')]")));
            ArrayList<WebElement> address = new ArrayList<>(driver.findElements(By.className("address-3-YC0")));

            //create print statement to click first link for first zip, second link for 2nd zip, first link for 3rd zip.
            if (i==0){
                System.out.println("The first address is: " + address.get(0).getText());
                studio.get(0).click();
            } else if (i==1){
                System.out.println("The second address is: " + address.get(0).getText());
                studio.get(1).click();
            } else if (i==2){
                System.out.println("The third address is: " + address.get(0).getText());
                studio.get(0).click();
            }//end of conditional statement

            Thread.sleep(2000);

            //create a webElement shortcut to schedule
            WebElement scheduleLive = driver.findElement(By.xpath("//*[@id='studioWorkshopSchedule']"));

            //scroll to bottom to click on studio workshop
            JavascriptExecutor jse = (JavascriptExecutor)driver;

            //scroll using pixels
            jse.executeScript("scroll(0,500)");

            Thread.sleep(4000);

            ArrayList<WebElement> workshopSchedule = new ArrayList<>(driver.findElements(By.xpath("//*[@class='day-NhBOb']")));
            //create print statement to click first link for first zip, second link for 2nd zip, first link for 3rd zip. Also a print statement will generate the names of the class leaders with dates and times

            for (int stu= 0; stu < workshopSchedule.size(); stu++) {

                if (stu == 0) {
                    System.out.println(workshopSchedule.get(0).getText());
                }
                if (stu == 1) {
                    System.out.println(workshopSchedule.get(1).getText());
                }
                if (stu == 2) {
                    System.out.println(workshopSchedule.get(2).getText());
                }



            }//end of conditional statement




        }//end of loop

    }//end of main
}//end of class
