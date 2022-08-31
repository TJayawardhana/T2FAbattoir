package Products;

public class Tc_SelectProductCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        selectProductCategoryAsBeef();
    }

    private static void selectProductCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
//        clickOnProductCategory();
        selectProductAsBeef();
        signOut();
        reportEnd();
    }
}
