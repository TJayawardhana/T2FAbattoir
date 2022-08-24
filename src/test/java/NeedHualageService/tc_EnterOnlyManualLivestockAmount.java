package NeedHualageService;

public class tc_EnterOnlyManualLivestockAmount extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        enterOnlyManualLivestockAmount();
    }
    public static void enterOnlyManualLivestockAmount() throws InterruptedException {
        report.createReport("tc_EnterOnlyManualLivestockAmount");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessage();
        haulageServiceManualAmount();
        clickOnSendRequestButton();
        signOut();
        report.endReporting();
    }
}
