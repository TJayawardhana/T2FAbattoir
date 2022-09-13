package Products;

public class Tc_AddProductWithInvalidStartingWeightAndCategory extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithInvalidStartingWeightAndCategory();
    }

    private static void addProductWithInvalidStartingWeightAndCategory() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterInvalidStartingWeightRange();
        enterEndWeightRange();
        enterOrganicPrices();
        enterNonOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }

}
