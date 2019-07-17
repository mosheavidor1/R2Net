package UdemyProject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SeleniumResults {

    public static void search(WebDriver driver) {

        driver.findElement(By.name("q")).sendKeys("selenium ");


        driver.findElement(By.xpath("//span[@class=\"input-group-btn\"]")).click();


    }


    public static void CheckResult(WebDriver driver) {


        driver.manage().timeouts().implicitlyWait(5000, SECONDS);


        String actualString = driver.findElement(By.xpath("//div[@class='header--header--2R8JP']")).getText();
        System.out.println(actualString);
        {


            int number = 1159;
            if (number > 0) {
                System.out.println("success");
            } else System.out.println("failed");


        }
    }

    public static void Rating(WebDriver driver) throws InterruptedException {

        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[@class=\"hidden-xxs\"]")).click();

        Thread.sleep(5000);


        int i = 0;

        List<WebElement> allOptions = driver.findElements(By.xpath("//span[@class=\"toggle-control-label checkbox-label\"]"));


      //  ratings-filter-option--filter-option--1yNK_ checkbox

        for (WebElement we : allOptions) {
            i++;
            if (i == 24) {
                we.click();



                Thread.sleep(5000);




                        driver.findElement(By.xpath("//button[@class=\'btn btn-secondary\']")).click();

            }




        }
    }
}
