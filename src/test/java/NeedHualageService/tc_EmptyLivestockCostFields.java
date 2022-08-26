package NeedHualageService;

public class tc_EmptyLivestockCostFields extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        emptyLivestockCostFields();
    }

    private static void emptyLivestockCostFields() throws InterruptedException {
        report.createReport("tc_EmptyLivestockCostFields");
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
        signOut();
        reportEnd();
    }
}
