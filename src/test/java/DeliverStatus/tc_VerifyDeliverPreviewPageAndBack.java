package DeliverStatus;

public class tc_VerifyDeliverPreviewPageAndBack extends DeliveryStatusStep{
    public static void main(String[] args) throws InterruptedException {
        verifyDeliverPreviewPageAndBack();
    }

    private static void verifyDeliverPreviewPageAndBack() throws InterruptedException {
        report.createReport("tc_VerifyDeliverPreviewPageAndBack");
        openBrowser();
        login();
        clickBookingTab();
        clickDeliveryProcessStatus();
        clickBackButton();
        //without Click Drop down
        signOut();
        reportEnd();

    }
}
