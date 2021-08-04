package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarRegistro implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on("INP_PIM"));
        actor.attemptsTo(Click.on("INP_CHECK_BOX"));
        actor.attemptsTo(Click.on("INP_BORRAR"));



    }
}
