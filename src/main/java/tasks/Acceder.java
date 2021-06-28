package tasks;

import models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Acceder  implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(Usuario.get(0)).getUsua
    }
}
