package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongEmailFormatInvalidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        wrongEmailFormatInvalidPassword();
    }

    public static void wrongEmailFormatInvalidPassword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongEmailFormatInvalidPassword");
        enterWrongEmailFormat();

        enterInvalidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        report.endReporting();
    }
}
