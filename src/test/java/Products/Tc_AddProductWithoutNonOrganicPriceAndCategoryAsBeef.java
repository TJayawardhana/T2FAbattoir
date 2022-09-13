package Products;

public class Tc_AddProductWithoutNonOrganicPriceAndCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutNonOrganicPriceAndCategoryAsBeef();
    }

    private static void addProductWithoutNonOrganicPriceAndCategoryAsBeef() throws InterruptedException {
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
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
