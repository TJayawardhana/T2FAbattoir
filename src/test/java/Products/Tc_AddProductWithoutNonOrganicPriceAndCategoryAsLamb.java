package Products;

public class Tc_AddProductWithoutNonOrganicPriceAndCategoryAsLamb extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutNonOrganicPriceAndCategoryAsLamb();
    }

    private static void addProductWithoutNonOrganicPriceAndCategoryAsLamb() throws InterruptedException {
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
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
