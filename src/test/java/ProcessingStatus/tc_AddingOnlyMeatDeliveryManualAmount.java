package ProcessingStatus;

public class tc_AddingOnlyMeatDeliveryManualAmount extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        addingOnlyMeatDeliveryManualAmount();
    }

    private static void addingOnlyMeatDeliveryManualAmount() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
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
