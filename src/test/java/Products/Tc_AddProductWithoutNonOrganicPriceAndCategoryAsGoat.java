package Products;

public class Tc_AddProductWithoutNonOrganicPriceAndCategoryAsGoat extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutNonOrganicPriceAndCategoryAsGoat();
    }

    private static void addProductWithoutNonOrganicPriceAndCategoryAsGoat() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsGoat();
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
