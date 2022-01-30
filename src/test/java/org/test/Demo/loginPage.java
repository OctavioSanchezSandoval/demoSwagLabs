package org.test.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class loginPage{

    //ELEMENTOS HTML
    //Username element
    private By usernameInput = By.id("user-name");
    public By getUsernameInput(){
        return usernameInput;
    }

    //Password element
    private By passwordInput = By.id("password");
    public By getPasswordInput(){
        return passwordInput;
    }

    //Login button element
    private By loginButton = By.id("login-button");
    public By getLoginButton(){
        return loginButton;
    }

    //Title Products
    private By productsTitle = By.cssSelector("#header_container > div.header_secondary_container > span");
    public By getProductsTitle(){
        return productsTitle;
    }

}
