package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")

public class LoginPaginaPrincipal extends PageObject {

    public static final Target INP_USUARIO = Target.the("INGRESAR USUARIO").located(By.id("txtUsername"));
    public static final Target INP_PASSWORD = Target.the("INGRESAR PASSWORD").located(By.id("txtPassword"));
    public static final Target INP_LOGIN = Target.the("HACER LOGIN").located(By.name("Submit"));
    public static final Target INP_Buzz = Target.the("Verificar_Pagina").located(By.id("menu_buzz_viewBuzz"));


}
