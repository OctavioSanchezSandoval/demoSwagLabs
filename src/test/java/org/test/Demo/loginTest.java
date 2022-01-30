package org.test.Demo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class loginTest {
    private WebDriver driver;
    logicAction LogicAction;

    @Before
    public void setUp() throws Exception{
        //Creamos instancia de ejecucion
        LogicAction = new logicAction(driver);
        driver = LogicAction.chromeDriverConnection();
        LogicAction.visitPage("https://www.saucedemo.com/");

    }
    @After
    public void closePage() throws Exception{
        //Cerramos el browser
        driver.quit();
    }

    @Test
    public void ingresoAlSitio() throws InterruptedException {
        //Escribimos el usuario
        LogicAction.writeUser();
        //Escribimos la contraseña
        LogicAction.writePass();
        //Click login
        LogicAction.clickLogin();
        //Verificamos si entramos leyendo el titulo
        boolean verifyTitle = LogicAction.verifyTitile();
        //Usamos este sleep solamente para ver la pagina porque cierra al instante.
        Thread.sleep(3000);
        //Assert verificador
        Assert.assertTrue(verifyTitle);
    }
}
