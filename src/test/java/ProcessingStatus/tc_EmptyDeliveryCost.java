package ProcessingStatus;

public class tc_EmptyDeliveryCost extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        emptyDeliveryCost();
    }

    private static void emptyDeliveryCost() throws InterruptedException {

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
