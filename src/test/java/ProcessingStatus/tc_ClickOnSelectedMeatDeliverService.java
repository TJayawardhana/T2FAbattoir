package ProcessingStatus;

public class tc_ClickOnSelectedMeatDeliverService extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        clickOnSelectedMeatDeliverService();
    }

    private static void clickOnSelectedMeatDeliverService() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        selectMeatDelivery();
        verifyJKLMessageSelectedDeliveryService();
        signOut();
        reportEnd();

    }
}
