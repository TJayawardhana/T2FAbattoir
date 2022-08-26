package NeedHualageService;

public class tc_VerifyNeedHaulagePreviewPageAndBack extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        verifyNeedHaulagePreviewPageAndBack();
    }
    private static void verifyNeedHaulagePreviewPageAndBack() throws InterruptedException {
        report.createReport("tc_VerifyNeedHaulagePreviewPage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        verifyPreviewPage();
        clickBackButton();
        signOut();
        reportEnd();
    }
}
