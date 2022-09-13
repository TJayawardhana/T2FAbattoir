package Products;

public class Tc_AddProductWithoutProductDisplayAndCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductDisplayAndCategoryAsBeef();
    }

    private static void addProductWithoutProductDisplayAndCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsBeef();
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
