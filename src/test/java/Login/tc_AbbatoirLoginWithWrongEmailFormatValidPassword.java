package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongEmailFormatValidPassword extends LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        wrongEmailFormatValidPassword();
    }

    private static void wrongEmailFormatValidPassword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongEmailFormatValidPassword");

        enterWrongEmailFormat();

        enterValidPassword();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        reportEnd();
    }
}
