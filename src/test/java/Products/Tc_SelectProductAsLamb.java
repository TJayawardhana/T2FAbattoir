package Products;

public class Tc_SelectProductAsLamb extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        selectProductCategoryAsLamb();
    }

    private static void selectProductCategoryAsLamb() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
//        clickOnProductCategory();
        selectProductAsLamb();
        signOut();
        reportEnd();
    }
}
