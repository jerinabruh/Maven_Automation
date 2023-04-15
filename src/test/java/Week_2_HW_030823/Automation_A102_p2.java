package Week_2_HW_030823;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Automation_A102_p2 {
    public static void main(String[] args) throws InterruptedException {
        //create web driver manager
        WebDriverManager.chromedriver().setup();

        //define chrome driver
        WebDriver driver = new ChromeDriver();

        //set up ArrayList of Sports
        ArrayList<String>sports = new ArrayList<>();
        sports.add("Tennis");
        sports.add("Formula One");
        sports.add("Golf");
        sports.add("Rugby");

        //iterate through the list of sports and print out search result number for each sport
        for(int i=0; i<sports.size(); i++){
            //navigate to bing homepage
            driver.navigate().to("https://www.bing.com");

            //wait 2 seconds
            Thread.sleep(2000);

            //enter tennis into search field to begin ArrayList loop
            driver.findElement(By.xpath("//*[@class='sb_form_q sb_form_ta']")).sendKeys(sports.get(i));

            //click on bing search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();

            //wait 2 seconds
            Thread.sleep(2000);

            //capture search results using .getText()
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            //print out the number only
            String[] arrayResult = result.split(" ");
            System.out.println("For " + sports.get(i) + ", the search number is " + arrayResult[1]);

        }//end of loop

        // end of driver
        driver.quit();



    }//end of main
}//end of class
