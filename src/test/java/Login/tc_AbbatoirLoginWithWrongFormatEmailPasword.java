package Login;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithWrongFormatEmailPasword extends LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        wrongFormatEmailPasword();
    }

    public static void wrongFormatEmailPasword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongFormatEmailPasword");
        enterWrongEmailFormat();

        enterWrongPasswordFormat();

        clickSignIn();

        clickUserDropdown();

        clickSignOut();

        closeDrive();

        report.endReporting();
    }
}
