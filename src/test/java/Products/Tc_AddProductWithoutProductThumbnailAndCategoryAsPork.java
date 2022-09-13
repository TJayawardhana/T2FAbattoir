package Products;

public class Tc_AddProductWithoutProductThumbnailAndCategoryAsPork extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductThumbnailAndCategoryAsPork();
    }

    private static void addProductWithoutProductThumbnailAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        enterProductName();
        selectDisplayImage();
        enterStartingWeightRange();
        enterEndWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
