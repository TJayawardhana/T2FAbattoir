package Login;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyPasswordWithValidEmail extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        emptyPasswordWithValidEmail();
    }

    private static void emptyPasswordWithValidEmail() throws InterruptedException {
//        Report report = new Report();
        report.createReport("tc_AbbatoirLoginWithEmptyPasswordWithValidEmail");
        /*try {
            // Enter Valid Username or Email
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");
            report.test.log(LogStatus.PASS, "Entered Correct Username");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Wrong Username");
        }*/
        enterValidEmail();

        keepBlankPassword();

        /*try {
            //Keep Empty Password
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("");
            report.test.log(LogStatus.PASS, "Empty Password Field");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Displaying Password");
        }*/
        clickSignIn();

        /*try {
            //Click on SignIn Button
//            driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
            clickSignIn();
            report.test.log(LogStatus.PASS, "Clicked Button Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Button is not Clicked");
        }*/
//        Thread.sleep(5000);
        clickUserDropdown();

        /*try {
            // Click on User Drop Down
//            driver.findElement(By.id("userDropdown")).click();
            clickUserDropdown();
            report.test.log(LogStatus.PASS, "Clicked User DropDown Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "User DropDown Icon is not Clicked");
        }*/
//        Thread.sleep(5000);
        clickSignOut();

       /* try {
            // Click on Sign Out
//            driver.findElement(By.id("signoutButton")).click();
            clickSignOut();
            report.test.log(LogStatus.PASS, "Clicked SignOut Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "SignOut Button is not Clicked");
        }*/
        closeDrive();

        /*try {
            // Close Drive
            driver.quit();
            report.test.log(LogStatus.PASS, "Drive Quit Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Drive Quit Unsuccessfully");
        }*/
        reportEnd();

    }

}
