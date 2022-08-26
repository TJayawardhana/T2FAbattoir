package ProcessingStatus;

public class tc_AddingOnlyOffalDeliveryManualAmount extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        addingOnlyOffalDeliveryManualAmount();

    }

    private static void addingOnlyOffalDeliveryManualAmount() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickProcessingStatus();
        clickAssignDeliveryButton();
        meatDeliveryTotalKm();
        meatDeliveryServiceManualAmount();
        offalDeliveryTotalKm();
        offalDeliveryManualAmount();
        clickOnSendRequestButton();
        verifyAssignMeatDeliverySuccessfulMessage();
        signOut();
        reportEnd();
    }
}
