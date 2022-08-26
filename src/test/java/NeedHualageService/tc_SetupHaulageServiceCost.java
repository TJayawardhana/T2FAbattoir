package NeedHualageService;

public class tc_SetupHaulageServiceCost extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        setupHaulageServiceCost();
    }
    private static void setupHaulageServiceCost() throws InterruptedException {
        report.createReport("tc_SetupHaulageServiceCost");
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
        signOut();
        reportEnd();
    }
}
