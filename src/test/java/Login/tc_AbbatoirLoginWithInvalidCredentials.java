package Login;


public class tc_AbbatoirLoginWithInvalidCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        invalidCredentials();
    }

    private static void invalidCredentials() throws InterruptedException {
        report.createReport("tc_AbbatoirLoginWithInvalidCredentials");
        openBrowser();
        enterInvalidEmail();
        enterInvalidPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }
}
