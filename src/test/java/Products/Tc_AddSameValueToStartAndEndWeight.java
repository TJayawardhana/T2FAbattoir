package Products;

public class Tc_AddSameValueToStartAndEndWeight extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        addSameValueToStartAndEndWeight();
    }

    private static void addSameValueToStartAndEndWeight() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterSameStartAndEndWeightValue();
        enterNonOrganicPrices();
        enterInvalidOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }



}
