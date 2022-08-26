package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongPasswordFormatInvalidEmail extends LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        wrongPasswordFormatInvalidEmail();
    }

    private static void wrongPasswordFormatInvalidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongPasswordFormatInvalidEmail");
        enterInvalidEmail();

        enterWrongPasswordFormat();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        reportEnd();
    }

}
