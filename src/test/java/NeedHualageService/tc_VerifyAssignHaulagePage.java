package NeedHualageService;

public class tc_VerifyAssignHaulagePage extends NeedHaulageService {
    public static void main(String[] args) throws InterruptedException {
        verifyAssignHaulagePage();
    }
    private static void verifyAssignHaulagePage() throws InterruptedException {
        report.createReport("tc_VerifyAssignHaulagePage");
        openBrowser();
        login();
        clickBookingTab();
        clickNeedHaulageServiceStatus();
        clickAssignHaulage();
        signOut();
        reportEnd();

    }
}
