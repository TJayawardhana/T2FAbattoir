package Login;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;


import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyEmailWithValidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        loginWithEmptyEmailWithValidPassword();

    }

    private static void loginWithEmptyEmailWithValidPassword() throws InterruptedException {
//        Report report = new Report();
        report.createReport("tc_AbbatoirLoginWithEmptyEmailWithValidPassword");
        /*try {
            // Open URL
            driver.get("https://qa-portal.trade2farm.ie/login");
            report.test.log(LogStatus.PASS,"Successfully Navigated");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cannot load URL");
        };

        // Maximise the Browser
        driver.manage().window().maximize();*/
       /* try {
            // Keep Empty Username or Email
            *//* driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("");*//*
            keepBlankEmail();
            report.test.log(LogStatus.PASS, "Empty User Name Field");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Displaying User Name");
        }*/
        keepBlankEmail();

        /*try {
            //Enter Valid Password
            *//*driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyperspace123");*//*
            enterValidPassword();
            report.test.log(LogStatus.PASS, "Entered Correct Password");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Wrong Password");
        }
*/
        enterValidPassword();

        /*try {
            //Click on SignIn Button
            clickSignIn();
//            driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
            report.test.log(LogStatus.PASS, "Clicked Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Button is not Clicked");
        }*/
        clickSignIn();

//        Thread.sleep(7000);
        /*try {
            // Click on User Drop Down
            driver.findElement(By.id("userDropdown")).click();
            report.test.log(LogStatus.PASS, "Clicked User DropDown Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "User DropDown Icon is not Clicked");
        }
*/
        clickUserDropdown();
//        Thread.sleep(5000);
     /*   try {
            // Click on Sign Out
            driver.findElement(By.id("signoutButton")).click();
            report.test.log(LogStatus.PASS, "Clicked SignOut Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "SignOut Button is not Clicked");
        }*/

        clickSignOut();

//        Thread.sleep(5000);
        /*try {
            // Close Drive
            driver.quit();
            report.test.log(LogStatus.PASS, "Drive Quit Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Drive Quit Unsuccessfully");
        }
*/
        closeDrive();


        reportEnd();

    }

}
