package Login;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;


import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyEmailWithValidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        loginWithEmptyEmailWithValidPassword();

    }

    private static void loginWithEmptyEmailWithValidPassword() throws InterruptedException {
        report.createReport("tc_AbbatoirLoginWithEmptyEmailWithValidPassword");
        openBrowser();
        keepBlankEmail();
        enterValidPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();

    }

}
