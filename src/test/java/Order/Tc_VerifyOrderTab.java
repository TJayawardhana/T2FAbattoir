package Order;

public class Tc_VerifyOrderTab extends OrderSteps {
    public static void main(String[] args) throws InterruptedException {
        verifyOrderTab();
    }

    private static void verifyOrderTab() throws InterruptedException {
        openBrowser();
        login();
        clickOrderTab();
        verifyOrderPageHeader();
        signOut();
        reportEnd();
    }
}
