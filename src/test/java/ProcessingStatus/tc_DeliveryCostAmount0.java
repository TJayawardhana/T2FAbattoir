package ProcessingStatus;

public class tc_DeliveryCostAmount0 extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        deliveryCostAmount0();
    }

    private static void deliveryCostAmount0() throws InterruptedException {
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
