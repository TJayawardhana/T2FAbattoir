package Login;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithInvalidCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        invalidCredentials();
    }

    private static void invalidCredentials() throws InterruptedException {
        report.createReport("tc_AbbatoirLoginWithInvalidCredentials");
        openBrowser();
        enterInvalidEmail();
        enterInvalidPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }
}
