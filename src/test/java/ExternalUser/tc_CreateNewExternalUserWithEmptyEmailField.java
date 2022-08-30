package ExternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CreateNewExternalUserWithEmptyEmailField extends ExternalUserSteps{
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyEmailField();
    }

    private static void createNewExternalUserWithEmptyEmailField() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        selectUserTypeRoleButcher();
        enterFirstName();
        enterLastName();
        enterValidContactNumber();
        keepEmptyMail();
        enterValidOrganizationName();
        clickOnAddNewButtonExternalNInternalUSer();
        closeDrive();
        reportEnd();
    }
}
