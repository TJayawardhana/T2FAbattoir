package ExternalUser;

public class tc_CreateNewExternalUserWithEmptyFirstName extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyFirstName();
    }

    private static void createNewExternalUserWithEmptyFirstName() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        selectUserTypeRoleButcher();
        keepEmptyFirstName();
        enterLastName();
        enterValidContactNumber();
        enterValidMail();
        enterValidOrganizationName();
        enterDoneButtonInExternalUser();
        closeDrive();
        reportEnd();
    }

}
