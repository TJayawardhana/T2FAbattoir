package ProcessingStatus;

public class tc_VerifyFarmDetailsHeader extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        verifyFarmDetailsHeader();
    }

    private static void verifyFarmDetailsHeader() throws InterruptedException {
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        verifyPreviewPage();
        verifyFarmDetailHeader();
        signOut();
        reportEnd();
    }
}
