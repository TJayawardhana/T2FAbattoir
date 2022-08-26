package PendingStatus;

public class tc_ApproveDeliveries extends PendingStatusSteps{
    public static void main(String[] args) throws InterruptedException {
        approveDeliveries();
    }
    private static void approveDeliveries() throws InterruptedException {
        report.createReport("tc_ApproveDeliveries");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickAssignHaulage();
        selectMeatDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        selectOffalDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        offalDeliveryTotalKm();
        meatDeliveryServiceManualAmount();
        offalDeliveryTotalKm();
        offalDeliveryManualAmount();
        clickOnSendRequestButton();
        verifyAssignMeatDeliverySuccessfulMessage();
        clickApproveOrRejectStock();
        clickApproveButton();
        verifyMessageBookingApprove();
        signOut();
        reportEnd();
    }
}
