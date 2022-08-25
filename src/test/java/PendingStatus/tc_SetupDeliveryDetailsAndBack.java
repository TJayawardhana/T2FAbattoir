package PendingStatus;

public class tc_SetupDeliveryDetailsAndBack extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        setupDeliveryDetailsAndBack();
    }

    public static void setupDeliveryDetailsAndBack() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickAssignHaulage();
        selectOffalDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        signOut();
        reportEnd();
    }
}
