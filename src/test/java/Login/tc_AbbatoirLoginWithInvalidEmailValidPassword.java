package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithInvalidEmailValidPassword extends LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        invalidEmailValidPassword();
    }

    public static void invalidEmailValidPassword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithInvalidEmailValidPassword");
        enterInvalidEmail();

        enterValidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        report.endReporting();
    }
}
