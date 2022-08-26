package NeedHualageService;

public class tc_VerifyNeedHaulagePreviewPage extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        verifyNeedHaulagePreviewPage();
    }
    private static void verifyNeedHaulagePreviewPage() throws InterruptedException {
        report.createReport("tc_VerifyNeedHaulagePreviewPage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        verifyPreviewPage();
        signOut();
        reportEnd();
    }
}
