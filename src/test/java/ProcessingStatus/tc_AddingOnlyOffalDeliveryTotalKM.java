package ProcessingStatus;

public class tc_AddingOnlyOffalDeliveryTotalKM extends ProcessingStatusSteps{
    public static void main(String[] args) throws InterruptedException {

        addingOnlyOffalDeliveryTotalKM();
    }

    private static void addingOnlyOffalDeliveryTotalKM() throws InterruptedException {
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
