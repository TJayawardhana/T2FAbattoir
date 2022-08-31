package Order;

import InternalUser.InternalUserSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertTrue;

public class OrderSteps extends InternalUserSteps {
    public static void clickOrderTab() throws InterruptedException {
        try {
            // Click on Order Tab
            driver.findElement(By.xpath("(//div[@class='nav-item-hold ng-star-inserted'])[3]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Order Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void verifyOrderPageHeader() throws InterruptedException {
        try {
            // Verify Order Page Header
            assertTrue(driver.getTitle().contains("Orders"));
            report.test.log(LogStatus.PASS, "Successfully Navigated to the Order Page");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Page is not Loading");
        }
        Thread.sleep(8000);
    }
    public static void clickOnAOrder() throws InterruptedException {
        try {
            // Click on A Order
            driver.findElement(By.xpath("(//div[@class='t_date'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked On A Order Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order is not Clickable");
        }

        Thread.sleep(8000);

    }

}
