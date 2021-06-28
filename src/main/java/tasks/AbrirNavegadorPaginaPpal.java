package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.HomePage.logInPanelHeading;

public class AbrirNavegadorPaginaPpal implements Task {


    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("\"https://opensource-demo.orangehrmlive.com/index.php\""));

        actor.should(seeThat(the(logInPanelHeading), isVisible()));

    }

    public static AbrirNavegadorPaginaPpal openBrowser(){
        return Tasks.instrumented(AbrirNavegadorPaginaPpal.class);

    }
}
