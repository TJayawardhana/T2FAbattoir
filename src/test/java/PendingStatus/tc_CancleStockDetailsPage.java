package PendingStatus;

public class tc_CancleStockDetailsPage extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        cancleStockDetailsPage();
    }

    private static void cancleStockDetailsPage() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickStockDetailsIcon();
        cancelIcon();
        signOut();
        reportEnd();
    }
}
