package NeedHualageService;

public class tc_SetupHaulageServiceCostAndApproved extends NeedHaulageService{
    public static void main(String[] args) throws InterruptedException {
        setupHaulageServiceCostAndApproved();
    }

    private static void setupHaulageServiceCostAndApproved() throws InterruptedException {
        report.createReport("tc_SetupHaulageServiceCostAndApproved");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyABCMessageSelectedDeliveryService();
        editHaulageServiceCost();
        haulageServiceManualAmount();
        clickOnSendRequestButton();
        verifyMessageSuccessfulSelectDeliveryService();
        clickApproveOrRejectStock();
        clickApproveButton();
        verifyMessageBookingApprove();
        signOut();
        reportEnd();
    }
}
