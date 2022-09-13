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
            report.test.log(LogStatus.PASS, "Successfully Clicked Product Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Product Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void clickOnProductCategory() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//select[@class='form-control ng-dirty ng-valid ng-touched']")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Create new product Button");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL," Create new product Button is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsBeef() throws InterruptedException {
        try {
            // Click on Select Product As Beef
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Selected Meat Category as Beef");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Beef Meat category is not Selectable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsPork() throws InterruptedException {
        try {
            //  Click on Select Product As Pork
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[2]")).click();
            report.test.log(LogStatus.PASS, "Successfully Selected Meat Category as Pork");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Pork Meat category is not Selectable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsLamb() throws InterruptedException {
        try {
            //  Click on Select Product As Lamb
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[3]")).click();
            report.test.log(LogStatus.PASS, "Successfully Selected Meat Category as Lamb");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Lamb Meat category is not Selectable");
        }

        Thread.sleep(8000);
    }
    public static void selectProductAsGoat() throws InterruptedException {
        try {
            //  Click on Select Product As Goat
            driver.findElement(By.xpath("(//option[@class='ng-star-inserted'])[4]")).click();
            report.test.log(LogStatus.PASS, "Successfully Selected Meat Category as Goat");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Goat Meat category is not Selectable");
        }

        Thread.sleep(8000);
    }
    public static void enterProductName() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            /*driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).clear();
            driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("BeefBuy");*/
            driver.findElement(By.xpath("//input[@formcontrolname='productName']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='productName']")).sendKeys("Adoo");
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void selectThumbnailImage() throws InterruptedException {
        try{
//            driver.findElement(By.xpath("//input[@formcontrolname='thumbnailImage']")).clear();
////            driver.findElement(By.xpath("//input[formcontrolname='thumbnailImage']")).sendKeys("D:/Firehouse/T2FNew/T2FAbattoir/src/test/img/Beef.png");
//            driver.findElement(By.xpath("//input[@formcontrolname='thumbnailImage']")).sendKeys("src/test/img/Beef.png");
//            driver.findElement(By.xpath("//input[@class='custom-file-input ng-pristine ng-invalid ng-touched']")).clear();
////            driver.findElement(By.xpath("//input[formcontrolname='thumbnailImage']")).sendKeys("D:/Firehouse/T2FNew/T2FAbattoir/src/test/img/Beef.png");
//            driver.findElement(By.xpath("//input[@class='custom-file-input ng-pristine ng-invalid ng-touched']")).sendKeys("src/test/img/Beef.png");
            driver.findElement(By.id("validatedInputGroupCustomFile1")).clear();
            driver.findElement(By.id("validatedInputGroupCustomFile1")).sendKeys("D:/Firehouse/T2FNew/T2FAbattoir/src/test/img/Beef.png");
        }
        catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Button not selected");
        }
        Thread.sleep(8000);
    }
    public static void selectDisplayImage() throws InterruptedException {
        try{
            driver.findElement(By.id("validatedInputGroupCustomFile1")).clear();
            driver.findElement(By.id("validatedInputGroupCustomFile1")).sendKeys("D:/Firehouse/T2FNew/T2FAbattoir/src/test/img/Beef.png");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Button not selected");
        }
        Thread.sleep(8000);
    }
    public static void enterStartingWeightRange() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@formcontrolname='startingWeight']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='startingWeight']")).sendKeys("100");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }
        Thread.sleep(8000);
    }
    public static void enterInvalidStartingWeightRange() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@formcontrolname='startingWeight']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='startingWeight']")).sendKeys("thousand");

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
            driver.findElement(By.xpath("//input[@formcontrolname='endingWeight']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='endingWeight']")).sendKeys("110");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterInvalidEndWeightRange() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@formcontrolname='endingWeight']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='endingWeight']")).sendKeys("thousand Five");

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
            driver.findElement(By.xpath("//input[@formcontrolname='nonOrganicPrice']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='nonOrganicPrice']")).sendKeys("1010");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void enterInvalidNonOrganicPrices() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@formcontrolname='nonOrganicPrice']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='nonOrganicPrice']")).sendKeys("thousand Five and Fifty Cents ");

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
            driver.findElement(By.xpath("//input[@formcontrolname='organicPrice']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='organicPrice']")).sendKeys("1200");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);

    }
    public static void enterInvalidOrganicPrices() throws InterruptedException {
        try {
            // Click on Create new Product Tab
            driver.findElement(By.xpath("//input[@formcontrolname='organicPrice']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='organicPrice']")).sendKeys("Five thousand and Fifty Cents");

            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(8000);

    }

//    clickDoneButton();



}
