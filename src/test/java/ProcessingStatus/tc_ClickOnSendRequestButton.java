package ProcessingStatus;

public class tc_ClickOnSendRequestButton extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        tcClickOnSendRequestButton();
    }

    private static void tcClickOnSendRequestButton() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        clickOnSendRequestButton();
        meatAndOffalDeliverAlreadyAssignMessage();
        signOut();
        reportEnd();
    }
}
