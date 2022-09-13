package Products;

public class Tc_AddProductWithoutEndWeightAndCategoryAsLamb extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutEndWeightAndCategoryAsLamb();
    }

    private static void addProductWithoutEndWeightAndCategoryAsLamb() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
