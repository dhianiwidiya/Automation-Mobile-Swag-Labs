package Login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.base.BasePage;

import java.util.HashMap;

public class LoginPage extends BasePage {
    @AndroidFindBy(xpath = "//*[@text=\"Username\"]")
    private MobileElement Username;

    @AndroidFindBy(accessibility = "test-Password")
    private MobileElement Password;
    @AndroidFindBy(accessibility = "test-LOGIN")
    private MobileElement clickLogin;
    @AndroidFindBy(xpath = "//*[@text=\"$29.99\"]")
    private static MobileElement txt29Dollar;
    @AndroidFindBy(xpath = "(//*[@text=\"ADD TO CART\"])[1]")
    private MobileElement addToCart;
    @AndroidFindBy(accessibility = "test-Cart")
    private MobileElement CartButton;
    @AndroidFindBy(xpath = "//*[@text=\"$29.99\"]")
    private static MobileElement veriftxt29Dollar;
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
    public void inputUsername(String username){
        sendKeys(Username, username);
    }
    public void inputPassword(String password){
        sendKeys(Password, password);
    }
    public void login(String username, String password){
        inputUsername(username);
        inputPassword(password);
    }
    public void clickButtonLogin(){
        click(clickLogin);
    }
    public void text29Dollar(){
        waitForVisibility(txt29Dollar);
    }
    public void clickAddtoCart(){
        click(addToCart);
    }
    public void ButtonCart(){
        click(CartButton);
    }
    static HashMap<String, String> value1 = new HashMap<>();
    public static void put29Dollar() {
        value1.put("verifText", txt29Dollar.getText());
    }
    public static String get29Dollar() {
        return value1.get("verifText");
    }
    public String verifyText29Dollar(){
        return getText(veriftxt29Dollar,"");
    }
}
