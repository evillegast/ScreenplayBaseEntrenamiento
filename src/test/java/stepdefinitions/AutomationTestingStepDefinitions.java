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
import userinterfaces.CrearEmpleado;
import userinterfaces.LoginPaginaPrincipal;
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
    private Actor Ramona = Actor.named("Ramona");
    private LoginPaginaPrincipal loginPaginaPrincipal = new LoginPaginaPrincipal();

    @Before
    public void setUp(){
        Ramona.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^que Paul accede a la web de Orange$")
    public void que_Paul_accede_a_la_web_de_Orange() {
        Ramona.attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/index.php"));

    }


    @Cuando("^el introduce su credenciales$")
    public void el_introduce_su_credenciales(List<Usuario> DatosUsuario) {
        Ramona.attemptsTo(Enter.theValue(USER_NAME.getValue()).into(INP_USUARIO));
        Ramona.attemptsTo(Enter.theValue(USER_PASSWORD.getValue()).into(INP_PASSWORD));
        Ramona.attemptsTo(Click.on(INP_LOGIN));
        getDriver().navigate().back();
        Ramona.should(seeThat(the(INP_Buzz), isPresent()));


    }

    @Cuando("^crea el usuario$")
    public void crea_el_usuario() {
        Ramona.attemptsTo(Click.on(INP_PIM));
        Ramona.attemptsTo(Click.on(ADD_EMPLOYEE));
        Ramona.attemptsTo(Enter.theValue(FIRTS_NAME1.getValue()).into(FIRTS_NAME));
        Ramona.attemptsTo(Enter.theValue(UserEnum.MIDDLE_NAME.getValue()).into(CrearEmpleado.MIDDLE_NAME.called("")));
        Ramona.attemptsTo(Enter.theValue(UserEnum.LASTNAME.getValue()).into(CrearEmpleado.LASTNAME.called("")));
        Ramona.attemptsTo(Click.on(BTN_SAVE));
        Ramona.attemptsTo(Click.on(BTN_EDIT));
        Ramona.attemptsTo(Enter.theValue(INP_LICENCIA_TXT.getValue()).into(INP_LICENCIA));
        Ramona.attemptsTo(Click.on(BTN_GENERO));


    }

    @Entonces("^el valida que se creo un nuevo registro$")
    public void el_valida_que_se_creo_un_nuevo_registro() {
        Ramona.should(seeThat(the(BTN_GENERO), isPresent()));
    }




    @Cuando("^elimina el registro$")
    public void elimina_el_registro() {
        Ramona.attemptsTo(Click.on(INP_PIM));
        Ramona.attemptsTo(Click.on(INP_EMPLOYEE_LIST));
        Ramona.attemptsTo(Click.on(INP_CHECK_BOX));
        Ramona.attemptsTo(Click.on(INP_BORRAR));
        Ramona.attemptsTo(Click.on(INP_OK_BORRAR));

    }

    @Entonces("^el visualiza el mensaje success delete$")
    public void el_visualiza_el_mensaje_success_delete() {
        Ramona.should(seeThat(the(INP_OK_BORRAR), isPresent()));

    }

}
