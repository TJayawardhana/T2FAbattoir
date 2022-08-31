package OpenBrowser;

import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Report.Report;

public class OpenWeb {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        openBrowser();

    }
    public static void openBrowser() throws InterruptedException {
        Report report = new Report();
        report.createReport("Login.tc_AbbatoirLoginWithEmptyCredentials");
        // Open Browser
        /*System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        try {
            // Open URL
            //QA
//          driver.get("https://qa-portal.trade2farm.ie/login");
            //DEV
            driver.get("https://dev-portal.trade2farm.ie/session/sign-in");
            report.test.log(LogStatus.PASS,"Successfully Navigated");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cannot load URL");
        };

        // Maximise the Browser
        driver.manage().window().maximize();
        Thread.sleep(7000);
    }

}
