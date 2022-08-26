package NeedHualageService;

public class tc_SetupAssignHaulageAndServiceCostAndBack extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        setupAssignHaulageAndServiceCostAndBack();
    }

    private static void setupAssignHaulageAndServiceCostAndBack() throws InterruptedException {
        report.createReport("tc_SetupAssignHaulageAndServiceCostAndBack");
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
