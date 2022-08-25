package NeedHualageService;

public class tc_SetupHaulageServiceCostAndApproved extends NeedHaulageService{
    public static void main(String[] args) throws InterruptedException {
        setupHaulageServiceCostAndApproved();
    }

    public static void setupHaulageServiceCostAndApproved() throws InterruptedException {
        report.createReport("tc_SetupHaulageServiceCostAndApproved");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessageSelectedDeliveryService();
        editHaulageServiceCost();
        haulageServiceManualAmount();
        clickOnSendRequestButton();
        verifyMessageSuccessfulSelectDeliveryService();
        clickApproveOrRejectStock();
        clickApproveButton();
        verifyMessageBooking();
        signOut();
        report.endReporting();
    }
}
