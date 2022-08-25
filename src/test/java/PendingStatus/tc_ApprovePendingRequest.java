package PendingStatus;

public class tc_ApprovePendingRequest extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
approvePendingRequest();
    }
    public static void approvePendingRequest() throws InterruptedException {
        report.createReport("tc_ApproveDeliveries");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickApproveOrRejectStock();
        clickApproveButton();
        verifyMessageBookingApprove();
        signOut();
        reportEnd();

    }
}
