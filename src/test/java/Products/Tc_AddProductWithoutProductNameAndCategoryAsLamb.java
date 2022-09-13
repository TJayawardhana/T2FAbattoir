package Products;

public class Tc_AddProductWithoutProductNameAndCategoryAsLamb extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductNameAndCategoryAsLamb();
    }

    private static void addProductWithoutProductNameAndCategoryAsLamb() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        selectThumbnailImage();
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
