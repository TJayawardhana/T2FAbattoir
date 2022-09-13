package Products;

public class Tc_AddProductWithoutOrganicPriceAndCategoryAsLamb extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutOrganicPriceAndCategoryAsLamb();
    }

    private static void addProductWithoutOrganicPriceAndCategoryAsLamb() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
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
