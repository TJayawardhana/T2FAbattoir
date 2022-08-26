package ProcessingStatus;

public class tc_EditDeliveryServiceCost extends ProcessingStatusSteps{
    public static void main(String[] args) throws InterruptedException {
        editDeliveryServiceCost();
    }

    private static void editDeliveryServiceCost() throws InterruptedException {
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
