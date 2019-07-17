package UdemyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.Assert.assertTrue;

public class Adidas {








    public static void FindSymble(WebDriver driver) {


        driver.manage().timeouts().implicitlyWait(5000, SECONDS);


        String actualString = driver.findElement(By.xpath("//img[@alt=\"adidas\"]")).getText();
        {
            System.out.println(actualString);


        }





    }

}
