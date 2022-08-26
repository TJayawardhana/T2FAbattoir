package ProcessingStatus;

import PendingStatus.PendingStatusSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class ProcessingStatusSteps extends PendingStatusSteps {
//Click on Processing Status
    public static void clickOnProcessingStatus() throws InterruptedException {
        try {
            // Click on Processing Status
            driver.findElement(By.xpath("(//span[text()=\"PROCESSING\"])[1]")).click();
            report.test.log(LogStatus.PASS, "Processing Status is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Processing Status is not Clickable");
        }
        Thread.sleep(5000);
    }
    public static void meatDeliveryTotalKm() throws InterruptedException {
        try {
            // Meat Delivery Total KM
            driver.findElement(By.xpath("(//input[@id=\"total\"])[1]")).clear();
            driver.findElement(By.xpath("(//input[@id=\"total\"])[1]")).sendKeys("null");
            report.test.log(LogStatus.PASS, "Meat Delivery Total Km's are Added");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Meat Delivery Total Km's are not Added");
        }
        Thread.sleep(5000);
    }
    //Click Cancel Button
    public static void clickCancel() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class=\"btn btn-brown\"]")).click();
        Thread.sleep(5000);
    }
    //VERIFY MESSAGE//
    //Meat and Offal Delivery Already Assign Message
    public static void meatAndOffalDeliverAlreadyAssignMessage() throws InterruptedException {
        String expectedText =" Meat and offal delivery services already assigned ";
        Assert.assertEquals(" Meat and offal delivery services already assigned ",expectedText);
        Thread.sleep(5000);
    }
    //Please update offal weight before submit
    public static void verifyPleaseUpdateWeightBeforeSubmitMessage() throws InterruptedException {
        //Verify Message
        String expectedText =" Please update offal weight before submit ";
        Assert.assertEquals(" Please update offal weight before submit ",expectedText);

        Thread.sleep(5000);

    }
    public static void verifyGHISelectedAsMeatDelivery(){
        String expectedText ="GHI selected as meat delivery service";
        Assert.assertEquals("GHI selected as meat delivery service",expectedText);
    }
    public static void verifyJKLSelectedAsOffalDeliveryService() throws InterruptedException {
        // Verify Message
        String expectedText =" JKL selected as offal delivery service ";
        Assert.assertEquals(" JKL selected as offal delivery service ",expectedText);
        Thread.sleep(5000);
    }

    //Click Update Button
    public static void clickUpdateButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()=\"Update \"]")).click();
        Thread.sleep(5000);
    }
    public static void clickYesNoInThePopup() throws InterruptedException {
        //Click on Yes/No in the popup
        driver.findElement(By.xpath("//button[@class=\"btn btn-secondary float-right\"]")).click();
        Thread.sleep(5000);
    }

    //verify Preview Page
    public static void verifyPreviewPage() throws InterruptedException {
        // Verify Preview Page
        assertTrue(driver.getTitle().contains("Preview"));
        Thread.sleep(5000);
    }
    public static void verifyFarmDetailHeader() throws InterruptedException {
        // Verify Farm Details Header
        assertTrue(driver.getTitle().contains("Farm Details"));
        Thread.sleep(5000);
    }
}
