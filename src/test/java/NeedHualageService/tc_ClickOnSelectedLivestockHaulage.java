package NeedHualageService;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_ClickOnSelectedLivestockHaulage extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        clickOnSelectedLivestockHaulage();
    }

    public static void clickOnSelectedLivestockHaulage() throws InterruptedException {
        report.createReport("tc_ClickOnSelctedLivestockHaulage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        selectHaulageService();
        verifyMessage();
        selectHaulageService();
        signOut();
        report.endReporting();
    }
}
