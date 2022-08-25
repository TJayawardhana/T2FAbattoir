package PendingStatus;

public class tc_SelectOffalDeliver extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        tcSelectOffalDeliver();
    }
    public static void tcSelectOffalDeliver() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickAssignDeliveryButton();
        selectOffalDelivery();
        verifySelectedGHIOffalDeliveryService();
        signOut();
        reportEnd();
    }

}
