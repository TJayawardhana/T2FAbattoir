package Products;

public class Tc_AddMinusEndWeightValue extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        addMinusEndWeightValue();
    }

    private static void addMinusEndWeightValue() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterMinusValueForEndWeight();
        enterNonOrganicPrices();;
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }


}
