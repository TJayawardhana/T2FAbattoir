package Dashboard;

import static Login.LoginSteps.login;
import static Login.LoginSteps.signOut;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_VerifyDashboard {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        login();
        signOut();
    }
}
