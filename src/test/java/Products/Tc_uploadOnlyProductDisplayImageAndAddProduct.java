package Products;

public class Tc_uploadOnlyProductDisplayImageAndAddProduct extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        uploadOnlyProductDisplayImageAndAddProduct();
    }

    private static void uploadOnlyProductDisplayImageAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectDisplayImage();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
