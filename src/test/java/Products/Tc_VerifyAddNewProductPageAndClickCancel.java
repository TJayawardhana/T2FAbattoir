package Products;

public class Tc_VerifyAddNewProductPageAndClickCancel extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        verifyAddNewProductPageAndClickCancel();
    }

    private static void verifyAddNewProductPageAndClickCancel() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        clickCancelInAddProduct();
        signOut();
        reportEnd();
    }
}
