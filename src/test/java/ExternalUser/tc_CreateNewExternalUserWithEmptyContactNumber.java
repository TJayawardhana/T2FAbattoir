package ExternalUser;

public class tc_CreateNewExternalUserWithEmptyContactNumber extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyContactNumber();
    }

    private static void createNewExternalUserWithEmptyContactNumber() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalUSer();
        selectUserTypeRoleButcher();
        enterFirstName();
        enterLastName();
        keepEmptyContactNumber();
        enterValidMail();
        enterValidOrganizationName();
        enterDoneButtonInExternalUser();
        closeDrive();
        reportEnd();
    }
}
