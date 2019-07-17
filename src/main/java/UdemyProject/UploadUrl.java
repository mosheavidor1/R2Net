package UdemyProject;

import org.openqa.selenium.WebDriver;

public class UploadUrl {

    public static void Upload(WebDriver driver) {


        driver.get(ConstantList.URL);
        driver.manage().window().maximize();
    }


}

