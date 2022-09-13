package Products;

public class Tc_AddProductWithoutOrganicPriceAndCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutOrganicPriceAndCategoryAsBeef();
    }

    private static void addProductWithoutOrganicPriceAndCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsBeef();
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
