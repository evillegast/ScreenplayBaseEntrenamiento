package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaPrincipal {

    public static final Target INP_USUARIO = Target.the("INGRESAR USUARIO").located(By.id("txtUsername"));
    public static final Target INP_PASSWORD = Target.the("INGRESAR PASSWORD").located(By.id("txtPassword"));
    public static final Target INP_LOGIN = Target.the("INGRESAR USUARIO").located(By.id("txtPassword"));
   // public static final Target logInPanelHeading = Target.the("INGRESAR PASSWORD").located(By.id("txtPassword"));



}
