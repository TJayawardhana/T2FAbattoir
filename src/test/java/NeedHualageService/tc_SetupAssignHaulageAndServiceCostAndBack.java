package NeedHualageService;

public class tc_SetupAssignHaulageAndServiceCostAndBack extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        setupAssignHaulageAndServiceCostAndBack();
    }

    public static void setupAssignHaulageAndServiceCostAndBack() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessage();
        editHaulageServiceCost();
        haulageServiceManualAmount();
        clickCancelButton();
        signOut();
        report.endReporting();

    }
}
