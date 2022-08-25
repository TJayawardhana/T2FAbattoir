package NeedHualageService;

public class tc_EnterOnlyLivestockTotalKM extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        enterOnlyLivestockTotalKM();
    }

    public static void enterOnlyLivestockTotalKM() throws InterruptedException {
        report.createReport("tc_EnterOnlyLivestockTotalKM");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessageSelectedDeliveryService();
        editHaulageServiceCost();
        clickOnSendRequestButton();
        signOut();
        report.endReporting();
    }
}
