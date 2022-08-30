package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongEmailFormatInvalidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        wrongEmailFormatInvalidPassword();
    }

    private static void wrongEmailFormatInvalidPassword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongEmailFormatInvalidPassword");
        openBrowser();
        enterWrongEmailFormat();
        enterInvalidPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }
}
