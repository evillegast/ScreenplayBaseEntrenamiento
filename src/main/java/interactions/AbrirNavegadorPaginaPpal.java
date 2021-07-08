package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirNavegadorPaginaPpal implements Interaction {


    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("\"https://opensource-demo.orangehrmlive.com/index.php\""));
        actor.attemptsTo(

                );


    }

    public static AbrirNavegadorPaginaPpal openBrowser(){
        return Tasks.instrumented(AbrirNavegadorPaginaPpal.class);

    }
}
