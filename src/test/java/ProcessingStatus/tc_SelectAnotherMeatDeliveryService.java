package ProcessingStatus;
public class tc_SelectAnotherMeatDeliveryService extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        selectAnotherMeatDeliveryService();
    }

    private static void selectAnotherMeatDeliveryService() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        selectHaulageService();
        verifyGHISelectedAsMeatDelivery();
        signOut();
        reportEnd();
    }
}
