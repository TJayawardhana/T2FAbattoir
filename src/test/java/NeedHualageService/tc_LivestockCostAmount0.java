package NeedHualageService;

public class tc_LivestockCostAmount0 extends NeedHaulageService{
    public static void main(String[] args) throws InterruptedException {
        livestockCostAmount0();
    }
    public static void livestockCostAmount0() throws InterruptedException {
        report.createReport("tc_LivestockCostAmount0");
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
