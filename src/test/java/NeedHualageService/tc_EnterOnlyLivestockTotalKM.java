package NeedHualageService;

public class tc_EnterOnlyLivestockTotalKM extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        enterOnlyLivestockTotalKM();
    }

    private static void enterOnlyLivestockTotalKM() throws InterruptedException {
        report.createReport("tc_EnterOnlyLivestockTotalKM");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyABCMessageSelectedDeliveryService();
        editHaulageServiceCost();
        clickOnSendRequestButton();
        signOut();
        reportEnd();
    }
}
