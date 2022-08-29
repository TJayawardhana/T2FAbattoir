package ExternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class tc_VerifyAddNewButton extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        verifyAddNewButton();
    }

    private static void verifyAddNewButton() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalUSer();
        closeDrive();
        reportEnd();
    }
}
