package Login;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithInvalidCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        invalidCredentials();
    }

    public static void invalidCredentials() throws InterruptedException {
//        Report report = new Report();
        report.createReport("tc_AbbatoirLoginWithInvalidCredentials");
        enterInvalidEmail();

        enterInvalidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        /*try {
            // Enter Invalid Username
            enterInvalidEmail();
            *//*driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoir@gmail.com");*//*
            report.test.log(LogStatus.PASS, "Entered Wrong Username");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Correct Username");
        }

        try {
            //Enter Invalid Password
            enterInvalidPassword();
            *//*driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyperspace");*//*
            report.test.log(LogStatus.PASS, "Entered Wrong Password");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Correct Password");
        }

        try {
            //Click on SignIn Button
            driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
            report.test.log(LogStatus.PASS, "Clicked Button Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Button is not Clicked");
        }


//        Thread.sleep(7000);

        try {
            // Close Drive
            driver.quit();
            report.test.log(LogStatus.PASS, "Drive Quit Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Drive Quit Unsuccessfully");
        }*/
        report.endReporting();
    }
}
