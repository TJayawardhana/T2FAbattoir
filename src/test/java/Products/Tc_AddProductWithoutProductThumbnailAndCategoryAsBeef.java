package Products;

public class Tc_AddProductWithoutProductThumbnailAndCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductThumbnailAndCategoryAsBeef();
    }

    private static void addProductWithoutProductThumbnailAndCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsBeef();
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
