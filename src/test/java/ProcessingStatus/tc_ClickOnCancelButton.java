package ProcessingStatus;

public class tc_ClickOnCancelButton extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        clickOnCancelButton();
    }

    private static void clickOnCancelButton() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickAssignDeliveryButton();
        clickCancel();
        signOut();
        reportEnd();
    }
}
