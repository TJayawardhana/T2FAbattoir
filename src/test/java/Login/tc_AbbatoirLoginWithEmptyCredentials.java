package Login;


import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        keepCredentialsEmpty();

    }

    private static void keepCredentialsEmpty() throws InterruptedException {
        openBrowser();
        report.createReport("Login.tc_AbbatoirLoginWithEmptyCredentials");
        keepBlankEmail();
        keepBlankPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();

    }
}


