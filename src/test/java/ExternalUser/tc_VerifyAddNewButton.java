package ExternalUser;

public class tc_VerifyAddNewButton extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        verifyAddNewButton();
    }

    private static void verifyAddNewButton() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        closeDrive();
        reportEnd();
    }
}
