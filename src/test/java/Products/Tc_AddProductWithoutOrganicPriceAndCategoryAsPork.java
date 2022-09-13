package Products;

public class Tc_AddProductWithoutOrganicPriceAndCategoryAsPork extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutOrganicPriceAndCategoryAsPork();
    }

    private static void addProductWithoutOrganicPriceAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterEndWeightRange();
        enterNonOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
