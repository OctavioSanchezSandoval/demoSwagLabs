package org.test.Demo;

import org.openqa.selenium.WebDriver;
import org.test.Demo.loginPage;
public class logicAction extends baseAction{


    public logicAction(WebDriver driver) {
        super(driver);
    }
    loginPage LoginPage = new loginPage();

    //Metodo para escribir usuario
    public void writeUser() throws InterruptedException{
        type("standard_user",LoginPage.getUsernameInput());
    }

    //Metodo para escribir contraseña
    public void writePass() throws InterruptedException{
        type("secret_sauce",LoginPage.getPasswordInput());
    }

    //Metodo para click login
    public void clickLogin() throws InterruptedException{
        click(LoginPage.getLoginButton());
    }

    //Metodo verifica titulo
    public Boolean verifyTitile() throws InterruptedException{
        boolean verifyExistanceProduct = isDisplayed(LoginPage.getProductsTitle());
        return verifyExistanceProduct;
    }
}
