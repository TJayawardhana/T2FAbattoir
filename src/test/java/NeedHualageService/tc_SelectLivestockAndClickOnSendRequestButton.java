package NeedHualageService;

public class tc_SelectLivestockAndClickOnSendRequestButton extends NeedHaulageService{
    public static void main(String[] args) throws InterruptedException {
        selectLivestockAndClickOnSendRequestButton();
    }
    public static void selectLivestockAndClickOnSendRequestButton() throws InterruptedException {
        report.createReport("tc_SelectLivestockAndClickOnSendRequestButton");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessage();
        clickOnSendRequestButton();
        signOut();
        report.endReporting();
    }
}
