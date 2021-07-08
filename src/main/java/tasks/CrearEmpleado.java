package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearEmpleado implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


    }

    public static CrearEmpleado nuevo() {
        return instrumented(CrearEmpleado.class);
    }
}
