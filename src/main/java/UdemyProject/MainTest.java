package UdemyProject;

import org.junit.FixMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;

        @FixMethodOrder

        public class MainTest {


            private static WebDriver driver;


            @BeforeClass
            public static void bc() {

//Sets the Browser's driver location for this test
                setProperty(ConstantList.upload1, ConstantList.upload2);

            }


            @Test

            public void Test_01() {

                driver = new ChromeDriver();

                UploadUrl.Upload(driver);
            }

            @Test

            public void Test_02() {

                SeleniumResults.search(driver);

            }

            @Test

            public void Test_03() {

                SeleniumResults.CheckResult(driver);


            }

            @Test

            public void Test_04() throws InterruptedException {

                SeleniumResults.Rating(driver);
            }


            @Test

            public void Test_05() {

                Review.RatingType(driver);

            }

            @Test

            public void Test_06() {

                Adidas.FindSymble(driver);

            }


            @Test

            public void Test_07() {

                DeleteCockies.Delete(driver);


            }
        }