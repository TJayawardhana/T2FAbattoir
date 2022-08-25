package NeedHualageService;

public class tc_SelectAnotherLivestockHaulage extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        selectAnotherLivestockHaulage();
    }
    public static void selectAnotherLivestockHaulage() throws InterruptedException {
        report.createReport("tc_SelectAnotherLivestockHaulage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessageSelectedDeliveryService();
        signOut();
        report.endReporting();
    }
}
