package NeedHualageService;

public class tc_ClickOnSelectedLivestockHaulage extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        clickOnSelectedLivestockHaulage();
    }

    private static void clickOnSelectedLivestockHaulage() throws InterruptedException {
        report.createReport("tc_ClickOnSelctedLivestockHaulage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyABCMessageSelectedDeliveryService();
        selectHaulageService();
        signOut();
        reportEnd();
    }
}
