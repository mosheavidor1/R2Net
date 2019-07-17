package UdemyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.Assert.assertTrue;

public class Review {

    public static void RatingType(WebDriver driver) {

        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver with Java & Cucumber BDD");


        driver.findElement(By.xpath("//span[@class=\"input-group-btn\"]")).click();

        driver.findElement(By.xpath("//div[@class=\"list-view-course-card--title--2pfA0\"]")).click();


            driver.manage().timeouts().implicitlyWait(5000, SECONDS);


            String actualString = driver.findElement(By.xpath("//div[@class=\"featured-review__title \"]")).getText();
            System.out.println(actualString);
            assertTrue(actualString.contains("Featured review"));




        }

    }

