package Products;

public class Tc_uploadOnlyProductThumbnailAndAddProduct extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        uploadOnlyProductThumbnailAndAddProduct();
    }

    private static void uploadOnlyProductThumbnailAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectThumbnailImage();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
