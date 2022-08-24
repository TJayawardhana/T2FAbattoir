package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithValidCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        validCredentials();
    }

    public static void validCredentials() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithValidCredentials");
        enterValidEmail();

        enterValidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        report.endReporting();
    }
}
