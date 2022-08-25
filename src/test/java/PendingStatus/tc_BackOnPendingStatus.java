package PendingStatus;

public class tc_BackOnPendingStatus extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        backOnPendingStatus();
    }

    public static void backOnPendingStatus() throws InterruptedException {
        report.createReport("tc_BackOnPendingStatus");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickBackButton();
        signOut();
        reportEnd();
    }
}
