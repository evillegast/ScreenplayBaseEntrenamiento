package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import interactions.AbrirNavegadorPaginaPpal;
import models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.CrearEmpleado;
import utils.UserEnum;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.CrearEmpleado.*;
import static userinterfaces.EliminarEmpleado.*;
import static userinterfaces.LoginPaginaPrincipal.*;
import static utils.UserEnum.*;

public class AutomationTestingStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Ramona");
    private AbrirNavegadorPaginaPpal abrirNavegadorPaginaPpal = new AbrirNavegadorPaginaPpal();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^que Paul accede a la web de Orange$")
    public void que_Paul_accede_a_la_web_de_Orange() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(abrirNavegadorPaginaPpal));

    }


    @Cuando("^el introduce su credenciales$")
    public void el_introduce_su_credenciales(List<Usuario> DatosUsuario) {
        actor.attemptsTo(Enter.theValue(USER_NAME.getValue()).into(INP_USUARIO));
        actor.attemptsTo(Enter.theValue(USER_PASSWORD.getValue()).into(INP_PASSWORD));
        actor.attemptsTo(Click.on(INP_LOGIN));
        getDriver().navigate().back();
        actor.should(seeThat(the(INP_Buzz), isPresent()));


    }

    @Cuando("^crea el usuario$")
    public void crea_el_usuario() {
        actor.attemptsTo(Click.on(INP_PIM));
        actor.attemptsTo(Click.on(ADD_EMPLOYEE));
        actor.attemptsTo(Enter.theValue(FIRTS_NAME1.getValue()).into(FIRTS_NAME));
        actor.attemptsTo(Enter.theValue(UserEnum.MIDDLE_NAME.getValue()).into(CrearEmpleado.MIDDLE_NAME.called("")));
        actor.attemptsTo(Enter.theValue(UserEnum.LASTNAME.getValue()).into(CrearEmpleado.LASTNAME.called("")));
        actor.attemptsTo(Click.on(BTN_SAVE));
        actor.attemptsTo(Click.on(BTN_EDIT));
        actor.attemptsTo(Enter.theValue(INP_LICENCIA_TXT.getValue()).into(INP_LICENCIA));
        actor.attemptsTo(Click.on(BTN_GENERO));


    }

    @Entonces("^el valida que se creo un nuevo registro$")
    public void el_valida_que_se_creo_un_nuevo_registro() {
        actor.should(seeThat(the(BTN_GENERO), isPresent()));
    }




    @Cuando("^elimina el registro$")
    public void elimina_el_registro() {
        actor.attemptsTo(Click.on(INP_PIM));
        actor.attemptsTo(Click.on(INP_EMPLOYEE_LIST));
        actor.attemptsTo(Click.on(INP_CHECK_BOX));
        actor.attemptsTo(Click.on(INP_BORRAR));
        actor.attemptsTo(Click.on(INP_OK_BORRAR));

    }

    @Entonces("^el visualiza el mensaje success delete$")
    public void el_visualiza_el_mensaje_success_delete() {
        actor.should(seeThat(the(INP_OK_BORRAR), isPresent()));

    }

}
