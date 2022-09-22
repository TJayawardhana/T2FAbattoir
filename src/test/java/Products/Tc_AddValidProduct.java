package Products;

public class Tc_AddValidProduct extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        addValidProduct();
    }

    private static void addValidProduct() throws InterruptedException {
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
        enterNonOrganicPrices();;
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }

}
