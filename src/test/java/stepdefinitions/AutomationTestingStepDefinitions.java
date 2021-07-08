package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static userinterfaces.PaginaPrincipal.*;
import static utils.UserEnum.USER_NAME;
import static utils.UserEnum.USER_PASSWORD;

public class AutomationTestingStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor Ramona = Actor.named("Ramona");

    @Before
    public void setUp() {
        Ramona.can(BrowseTheWeb.with(webDriver));
    }

    @Dado("^que Actor accede a la web$")
    public void queActorAccedeALaWeb() {
        Ramona.attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/index.php"));


    }


    @Cuando("^ingreso mis credenciales$")
    public void ingresoMisCredenciales(List<Usuario> DatosUsuario) {

        Ramona.attemptsTo(Enter.theValue(USER_NAME.getValue()).into(INP_USUARIO));
        Ramona.attemptsTo(Enter.theValue(USER_PASSWORD.getValue()).into(INP_PASSWORD));
        Ramona.attemptsTo(Click.on(INP_LOGIN));
    }


    @Entonces("^veo el panel principal$")
    public void veoElPanelPrincipal() {

    }


}
