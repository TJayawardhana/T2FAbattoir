package Products;

public class Tc_AddProductWithoutProductNameAndCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
    addProductWithoutProductNameAndCategoryAsBeef();
    }

    private static void addProductWithoutProductNameAndCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsBeef();
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
