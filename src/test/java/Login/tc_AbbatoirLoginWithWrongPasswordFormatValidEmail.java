package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongPasswordFormatValidEmail extends  LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        wrongPasswordFormatValidEmail();
    }

    public static void wrongPasswordFormatValidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongPasswordFormatValidEmail");
        enterValidEmail();

        enterWrongPasswordFormat();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        report.endReporting();
    }
}
