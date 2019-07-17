package UdemyProject;

import org.openqa.selenium.WebDriver;

public class DeleteCockies {


    public static void Delete(WebDriver driver) {

        driver.manage().deleteAllCookies();




    }
}