package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyEmailWithInvalidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        emptyEmailWithInvalidPassword();
    }

    private static void emptyEmailWithInvalidPassword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithEmptyEmailWithInvalidPassword");

        keepBlankEmail();

        enterInvalidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        reportEnd();
    }

}
