package NeedHualageService;

public class tc_EmptyLivestockCostFields extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        emptyLivestockCostFields();
    }

    public static void emptyLivestockCostFields() throws InterruptedException {
        report.createReport("tc_EmptyLivestockCostFields");
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
        signOut();
        report.endReporting();
    }
}
