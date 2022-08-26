package ProcessingStatus;

public class tc_AddingOnlyMeatDeliveryTotalKM extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        addingOnlyMeatDeliveryTotalKM();
    }

    private static void addingOnlyMeatDeliveryTotalKM() throws InterruptedException {
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
