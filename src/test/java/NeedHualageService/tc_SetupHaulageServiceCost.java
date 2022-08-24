package NeedHualageService;

public class tc_SetupHaulageServiceCost extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        setupHaulageServiceCost();
    }
    public static void setupHaulageServiceCost() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessage();
        editHaulageServiceCost();
        haulageServiceManualAmount();
        clickOnSendRequestButton();
        verifyMessage();
    }
}
