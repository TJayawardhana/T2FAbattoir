package Products;

import Order.OrderSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductsSteps extends OrderSteps {
    public static void mouseHoverOnProductIcon() throws InterruptedException {
        //Mouse hover on Product Icon
        Actions action = new Actions(driver);
        WebElement listingOptions = driver.findElement(By.xpath("//i[@class='i-Dropbox nav-icon']"));
        Thread.sleep(9000);
        action.moveToElement(listingOptions).perform();
    }
    public static void clickCreateNewTab() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//li[@class='nav-item ng-star-inserted'])[2]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void clickOnProductCategory() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//select[@class='form-control ng-dirty ng-valid ng-touched']")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsBeef() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsPork() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[2]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsLamb() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[3]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsGoat() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[4]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterProductName() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).clear();
            driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Beef Buy");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterStartingWeightRange() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@class='form-control ng-touched ng-dirty ng-invalid']")).clear();
            driver.findElement(By.xpath("//input[@class='form-control ng-touched ng-dirty ng-invalid']")).sendKeys("100");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterEndWeightRange() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched']")).clear();
            driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("110");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterNonOrganicPrices() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//input[@class='form-control ng-valid ng-touched ng-dirty'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@class='form-control ng-valid ng-touched ng-dirty'])[1]")).sendKeys("1010");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterOrganicPrices() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("(//input[@class='form-control ng-valid ng-touched ng-dirty'])[2]")).clear();
            driver.findElement(By.xpath("(//input[@class='form-control ng-valid ng-touched ng-dirty'])[2]")).sendKeys("1200");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);

    }
//    clickDoneButton();



}
