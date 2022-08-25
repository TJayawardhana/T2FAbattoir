package NeedHualageService;
public class tc_SelectLivestockTransport extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        selectLivestockTransport();
    }
    public static void selectLivestockTransport() throws InterruptedException {
        report.createReport("tc_SelectLivestockTransport ");
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
