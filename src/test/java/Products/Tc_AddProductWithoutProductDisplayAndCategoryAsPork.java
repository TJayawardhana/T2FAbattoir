package Products;

public class Tc_AddProductWithoutProductDisplayAndCategoryAsPork extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductDisplayAndCategoryAsPork();
    }

    private static void addProductWithoutProductDisplayAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        enterProductName();
        selectThumbnailImage();
        enterStartingWeightRange();
        enterEndWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
