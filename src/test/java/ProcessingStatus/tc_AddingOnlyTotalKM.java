package ProcessingStatus;

public class tc_AddingOnlyTotalKM extends ProcessingStatusSteps{
    public static void main(String[] args) throws InterruptedException {

        addingOnlyTotalKM();
    }

    private static void addingOnlyTotalKM() throws InterruptedException {
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
