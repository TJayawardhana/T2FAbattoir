package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongPasswordFormatValidEmail extends  LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        wrongPasswordFormatValidEmail();
    }

    private static void wrongPasswordFormatValidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongPasswordFormatValidEmail");
        openBrowser();
        enterValidEmail();
        enterWrongPasswordFormat();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }
}
