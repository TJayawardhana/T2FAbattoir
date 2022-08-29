package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyPasswordWithInvalidEmail extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        emptyPasswordWithInvalidEmail();
    }

    private static void emptyPasswordWithInvalidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithEmptyPasswordWithInvalidEmail");
        openBrowser();
        enterInvalidEmail();
        keepBlankPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }
}
