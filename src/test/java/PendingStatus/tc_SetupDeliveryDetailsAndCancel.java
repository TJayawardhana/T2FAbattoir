package PendingStatus;

public class tc_SetupDeliveryDetailsAndCancel extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        setupDeliveryDetailsAndCancel();
    }
    private static void setupDeliveryDetailsAndCancel() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickAssignHaulage();
        selectOffalDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        signOut();
        reportEnd();
    }
}
