package Login;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyPasswordWithValidEmail extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        emptyPasswordWithValidEmail();
    }

    private static void emptyPasswordWithValidEmail() throws InterruptedException {
        report.createReport("tc_AbbatoirLoginWithEmptyPasswordWithValidEmail");
        openBrowser();
        enterValidEmail();
        keepBlankPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();

    }

}
