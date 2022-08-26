package ProcessingStatus;

import PendingStatus.PendingStatusSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

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
    public static void clickCancel(){
        driver.findElement(By.xpath("//button[@class=\"btn btn-brown\"]")).click();
    }
}
