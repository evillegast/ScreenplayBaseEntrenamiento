package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {

    public static final Target INP_USUARIO = Target.the("INGRESAR USUARIO").located(By.id("txtUsername"));
    public static final Target INP_PASSWORD = Target.the("INGRESAR USUARIO").located(By.id("txtPassword"));
    public static final Target INP_LOGIN = Target.the("INGRESAR USUARIO").located(By.id("txtPassword"));
    public static final Target logInPanelHeading = Target.the("INGRESAR USUARIO").located(By.id("txtPassword"));











}
