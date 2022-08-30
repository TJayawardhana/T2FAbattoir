package InternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CreateNewInternalUserWithEmptyEmailField extends InternalUserSteps {

    public static void main(String[] args) throws InterruptedException {
        createNewInternalUserWithEmptyEmailField();
    }

    private static void createNewInternalUserWithEmptyEmailField() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnInternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        selectUserTypeRoleAbattoirManager();
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
