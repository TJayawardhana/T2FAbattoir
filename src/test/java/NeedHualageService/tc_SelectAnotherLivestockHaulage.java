package NeedHualageService;

public class tc_SelectAnotherLivestockHaulage extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        selectAnotherLivestockHaulage();
    }
    private static void selectAnotherLivestockHaulage() throws InterruptedException {
        report.createReport("tc_SelectAnotherLivestockHaulage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyABCMessageSelectedDeliveryService();
        signOut();
        reportEnd();
    }
}
