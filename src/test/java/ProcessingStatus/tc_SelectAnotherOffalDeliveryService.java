package ProcessingStatus;

public class tc_SelectAnotherOffalDeliveryService extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        selectAnotherOffalDeliveryService();
    }

    private static void selectAnotherOffalDeliveryService() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        selectOffalDelivery();
        verifyJKLSelectedAsOffalDeliveryService();
        signOut();
        reportEnd();
    }
}
