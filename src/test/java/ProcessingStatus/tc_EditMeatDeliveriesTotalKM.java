package ProcessingStatus;

public class tc_EditMeatDeliveriesTotalKM extends ProcessingStatusSteps{
    public static void main(String[] args) throws InterruptedException {

        editMeatDeliveriesTotalKM();
    }

    private static void editMeatDeliveriesTotalKM() throws InterruptedException {

        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        meatDeliveryTotalKm();
        clickOnSendRequestButton();
        verifyAssignMeatDeliverySuccessfulMessage();
        signOut();
        reportEnd();
    }
}
