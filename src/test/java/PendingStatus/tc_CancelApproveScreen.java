package PendingStatus;

public class tc_CancelApproveScreen extends PendingStatusSteps{
    public static void main(String[] args) throws InterruptedException {
        cancelApproveScreen();
    }

    public static void cancelApproveScreen() throws InterruptedException {
        report.createReport("tc_CancelApproveScreen");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickApproveOrRejectStock();
        clickCancelButtonPending();
        reportEnd();
    }
}
