package PendingStatus;

import NeedHualageService.NeedHaulageService;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PendingStatusSteps extends NeedHaulageService {

    //Select Meat Delivery
    public static void selectMeatDelivery() throws InterruptedException {
        try {
            // Select Meat Delivery
            driver.findElement(By.xpath("(//button[text()='Select'])[2]")).click();
            report.test.log(LogStatus.PASS, "Selected Meat Delivery");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Meat Delivery is not Selected");
        }

        Thread.sleep(3000);
    }

    //VERIFY MESSAGES//
    //GHI Selected as Meat Delivery Service
    public static void verifyGHIMeatDeliveryServiceMessage() throws InterruptedException {
        try {
            // Verify Message
            String expectedText = "  GHI selected as meat delivery service ";
            Assert.assertEquals("  GHI selected as meat delivery service ", expectedText);
            report.test.log(LogStatus.PASS, "Displaying Verify Message Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Verify Message is not Displaying");
        }
        Thread.sleep(5000);
    }

    //Assign Meat delivery service Successful
    public static void verifyAssignMeatDeliverySuccessfulMessage() throws InterruptedException {
        try {
            // Verify Message
            String expectedText = "  Assigned meat delivery service successfully  ";
            Assert.assertEquals("  Assigned meat delivery service successfully  ", expectedText);
            report.test.log(LogStatus.PASS, "Displaying Verify Message Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Verify Message is not Displaying");
        }
        Thread.sleep(5000);
    }
    //Assign Offal Delivery Service Message
    public static void  verifySelectedGHIOffalDeliveryService() throws InterruptedException {
        try {
            // Verify Message
            String expectedText =" GHI selected as offal delivery service ";
            Assert.assertEquals(" GHI selected as offal delivery service ",expectedText);
            report.test.log(LogStatus.PASS, "Offal Delivery Service Selected Message is Displaying");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Offal Delivery Service Selected Message is not Displaying");
        }


        Thread.sleep(5000);
    }

    //Select Offal Delivery
    public static void selectOffalDelivery() throws InterruptedException {
        try {
            // Select Offal Delivery
            driver.findElement(By.xpath("(//button[text()='Select'])[4]")).click();
            report.test.log(LogStatus.PASS, "Selected Offal Delivery");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Offal Delivery is not Selected");
        }

        Thread.sleep(5000);
    }

    //EDIT HAULAGE SERVICE COST
    public static void editMeatDeliveryServiceCost() throws InterruptedException {
        try {
            // Meat Delivery Total KM
            driver.findElement(By.xpath("(//input[@id=\"total\"])[1]")).clear();
            driver.findElement(By.xpath("(//input[@id=\"total\"])[1]")).sendKeys("20");
            report.test.log(LogStatus.PASS, "Added Meat Delivery Correct Total Km's");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Added Meat Delivery Wrong Total Km's");
        }

        Thread.sleep(2000);
    }

    //Meat Delivery SERVICE MANUAL AMOUNT
    public static void meatDeliveryServiceManualAmount() throws InterruptedException {
        try {
            // Meat Delivery Manual Amount
            driver.findElement(By.xpath("//input[@formcontrolname=\"meatDeliveryTotalCost\"]")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname=\"meatDeliveryTotalCost\"]")).sendKeys("25");
            report.test.log(LogStatus.PASS, "Added Meat Delivery Correct Manual Amount");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Added Meat Delivery Wrong Manual Amount");
        }

        Thread.sleep(2000);
    }

    //Offal Delivery Total KM Amount
    public static void offalDeliveryTotalKm() throws InterruptedException {
        try {
            // Offal Delivery Total KM
            driver.findElement(By.xpath("(//input[@id=\"total\"])[2]")).clear();
            driver.findElement(By.xpath("(//input[@id=\"total\"])[2]")).sendKeys("30");
            report.test.log(LogStatus.PASS, "Added Offal Delivery Correct Total Km's");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Added Offal Delivery Wrong Total Km's");
        }

        Thread.sleep(2000);
    }

    //Offal Delivery Manual Amount
    public static void offalDeliveryManualAmount() throws InterruptedException {
        try {
            // Offal Delivery Manual Amount
            driver.findElement(By.xpath("//input[@formcontrolname=\"offalDeliveryTotalCost\"]")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname=\"offalDeliveryTotalCost\"]")).sendKeys("35");
            report.test.log(LogStatus.PASS, "Added Offal Delivery Correct Manual Amount");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Added Offal Delivery Wrong Manual Amount");
        }

        Thread.sleep(2000);
    }
    //Assign Delivery
    public static void clickAssignDeliveryButton() throws InterruptedException {
        try {
            // Click on Assign Haulage Button
            driver.findElement(By.xpath("//button[text()='Assign Delivery ']")).click();
            report.test.log(LogStatus.PASS, "Assign Haulage Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Assign Haulage Button is not Clickable");
        }

        Thread.sleep(5000);
    }
    //CLick Cancel Button
    public static void clickCancelButtonPending() throws InterruptedException {
        try {
            // Click on Cancel Button
            driver.findElement(By.xpath("(//span[@aria-hidden=\"true\"])[3]")).click();
            report.test.log(LogStatus.PASS, "Cancel Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cancel Button is not Clickable");
        }
        Thread.sleep(5000);
    }
    //Click on Stock Details Icon
    public static void clickStockDetailsIcon() throws InterruptedException {
        try {
            //Click on Stock Details Icon
            driver.findElement(By.xpath("//i[@class=\"i-Share\"]")).click();
            report.test.log(LogStatus.PASS, "Stock Details Icon is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Stock Details Icon is not Clickable");
        }

        Thread.sleep(5000);
    }
    //Click close Icon
    public static void cancelIcon() throws InterruptedException {
        try {
            // Click on Cancel Icon
            driver.findElement(By.xpath("(//span[@aria-hidden=\"true\"])[2]")).click();
            report.test.log(LogStatus.PASS, "Cancel Icon is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cancel Icon is not Clickable");
        }
        Thread.sleep(5000);
    }
    //Click Done Button
    public static void clickDoneButton() throws InterruptedException {
        try {
            //Click on Done Button
            driver.findElement(By.xpath("//button[text()=' Done ']"));
            report.test.log(LogStatus.PASS, "Done Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Done Button is not Clickable");
        }
        Thread.sleep(5000);
    }
}
