package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CrearEmpleado.*;
import static utils.UserEnum.LASTNAME;
import static utils.UserEnum.MIDDLE_NAME;
import static utils.UserEnum.*;

public class CrearEmpleado implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on("INP_PIM"));
        actor.attemptsTo(Click.on("FIRTS_NAME"));
        Enter.theValue(FIRTS_NAME1.getValue());
        Enter.theValue(MIDDLE_NAME.getValue());
        Enter.theValue(LASTNAME.getValue());
        Click.on(BTN_SAVE);
        Click.on(BTN_EDIT);
        Click.on(INP_LICENCIA);
        Click.on(BTN_CALENDARIO);
        Click.on(BTN_GENERO);
        Click.on(BTN_PAIS);
        new SelectByVisibleTextFromBy("Angolan");









    }

    public static CrearEmpleado nuevo() {
        return instrumented(CrearEmpleado.class);
    }
}
