package Products;

public class Tc_AddProductWithoutProductThumbnailAndCategoryAsGoat extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductThumbnailAndCategoryAsGoat();
    }

    private static void addProductWithoutProductThumbnailAndCategoryAsGoat() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsGoat();
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
