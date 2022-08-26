package PendingStatus;

public class tc_AssignHaulages extends PendingStatusSteps{
    public static void main(String[] args) throws InterruptedException {

        assignHaulages();
    }
    private static void assignHaulages() throws InterruptedException {
        report.createReport("tc_AssignHaulages");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickAssignDeliveryButton();
        selectMeatDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        selectOffalDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        clickOnSendRequestButton();
        signOut();
        reportEnd();
    }
}
