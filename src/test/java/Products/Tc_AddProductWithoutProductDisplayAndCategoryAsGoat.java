package Products;

public class Tc_AddProductWithoutProductDisplayAndCategoryAsGoat extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductDisplayAndCategoryAsGoat();
    }

    private static void addProductWithoutProductDisplayAndCategoryAsGoat() throws InterruptedException {
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
