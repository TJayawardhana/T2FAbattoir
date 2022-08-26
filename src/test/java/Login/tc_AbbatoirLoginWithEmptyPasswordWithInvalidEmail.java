package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyPasswordWithInvalidEmail extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        emptyPasswordWithInvalidEmail();
    }

    private static void emptyPasswordWithInvalidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithEmptyPasswordWithInvalidEmail");

        enterInvalidEmail();

        keepBlankPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        reportEnd();
    }
}
