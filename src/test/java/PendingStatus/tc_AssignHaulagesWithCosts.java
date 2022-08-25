package PendingStatus;

public class tc_AssignHaulagesWithCosts extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
assignHaulagesWithCosts();
    }
    public static void assignHaulagesWithCosts() throws InterruptedException {
        report.createReport("tc_AssignHaulagesWithCosts");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickAssignDeliveryButton();
        selectMeatDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        selectOffalDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        editMeatDeliveryServiceCost();
        meatDeliveryServiceManualAmount();
        offalDeliveryTotalKm();
        offalDeliveryManualAmount();
        clickOnSendRequestButton();
        verifyAssignMeatDeliverySuccessfulMessage();
        signOut();
        reportEnd();

    }
}
