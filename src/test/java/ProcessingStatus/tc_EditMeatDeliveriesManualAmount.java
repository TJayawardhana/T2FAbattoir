package ProcessingStatus;

public class tc_EditMeatDeliveriesManualAmount extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        editMeatDeliveriesManualAmount();
    }

    private static void editMeatDeliveriesManualAmount() throws InterruptedException {

        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        meatDeliveryServiceManualAmount();
        verifyAssignMeatDeliverySuccessfulMessage();
        signOut();
        reportEnd();
    }
}
