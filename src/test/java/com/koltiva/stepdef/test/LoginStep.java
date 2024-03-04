package com.koltiva.stepdef.test;

import Login.LoginPage;
import com.koltiva.hooks.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_scouse.An;
import org.testng.Assert;
import utils.PropertyManager;

import java.io.IOException;
import java.util.Properties;

public class LoginStep {
    private final AndroidDriver<AndroidElement> driver;

    private final Properties props = new PropertyManager().getPropsDemo();

    public LoginStep() throws IOException {
        super();
        this.driver = Hooks.driver;
    }
    @Given("User input username and password")
    public void inputusernameAndpassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }
    @And("User input password")
    public void inputpassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPassword("secret_sauce");
    }
    @And("User click Login")
    public void clickLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonLogin();
    }
    @And("User verify $29.99")
    public void verify29Dollar(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.text29Dollar();
        LoginPage.put29Dollar();
    }
    @And("User click Add to Cart")
    public void addToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAddtoCart();
    }
    @And("User click Cart")
    public void Cart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.ButtonCart();
    }
    @And("User verify in Cart")
    public void verifyCart(){
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.verifyText29Dollar(),LoginPage.get29Dollar());
    }

}
