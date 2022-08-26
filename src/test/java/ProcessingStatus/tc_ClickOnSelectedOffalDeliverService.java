package ProcessingStatus;

public class tc_ClickOnSelectedOffalDeliverService extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        clickOnSelectedOffalDeliverService();
    }

    private static void clickOnSelectedOffalDeliverService() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        selectOffalDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        signOut();
        reportEnd();
    }
}
