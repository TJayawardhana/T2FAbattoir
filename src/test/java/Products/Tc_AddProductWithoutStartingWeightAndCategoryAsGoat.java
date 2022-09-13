package Products;

public class Tc_AddProductWithoutStartingWeightAndCategoryAsGoat extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutStartingWeightAndCategoryAsGoat();
    }

    private static void addProductWithoutStartingWeightAndCategoryAsGoat() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterEndWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
