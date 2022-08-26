package ProcessingStatus;

public class tc_AddingOnlyManualAmounts extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        addingOnlyManualAmounts();
    }
    public static void addingOnlyManualAmounts() throws InterruptedException {
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
