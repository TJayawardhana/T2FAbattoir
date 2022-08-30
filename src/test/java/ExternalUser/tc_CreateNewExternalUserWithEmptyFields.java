package ExternalUser;

public class tc_CreateNewExternalUserWithEmptyFields extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyFields();
    }
    private static void createNewExternalUserWithEmptyFields() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        keepEmptyUserType();
        keepEmptyFirstName();
        keepEmptyContactNumber();
        keepEmptyMail();
        keepEmptyOrganizationName();
        closeDrive();
        reportEnd();

    }
}
