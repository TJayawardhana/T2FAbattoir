package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithInvalidPasswordValidEmail extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        invalidPasswordValidEmail();
    }

    private static void invalidPasswordValidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithInvalidPasswordValidEmail");
        enterValidEmail();

        enterInvalidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        reportEnd();
    }
}
