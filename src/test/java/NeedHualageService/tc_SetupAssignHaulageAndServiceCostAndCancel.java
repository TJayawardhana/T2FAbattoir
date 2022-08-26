package NeedHualageService;

public class tc_SetupAssignHaulageAndServiceCostAndCancel extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        setupAssignHaulageAndServiceCostAndCancel();
    }
    private static void setupAssignHaulageAndServiceCostAndCancel() throws InterruptedException {
        report.createReport("tc_SetupAssignHaulageAndServiceCostAndCancel");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyABCMessageSelectedDeliveryService();
        editHaulageServiceCost();
        haulageServiceManualAmount();
        clickCancelButton();
        signOut();
        reportEnd();
    }
}
