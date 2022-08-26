package ProcessingStatus;

public class tc_VerifyStockDetailsHeader extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        verifyStockDetailsHeader();
    }

    private static void verifyStockDetailsHeader() throws InterruptedException {

        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        signOut();
        reportEnd();
    }
}
