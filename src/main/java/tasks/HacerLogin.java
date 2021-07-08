package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static userinterfaces.PaginaPrincipal.*;
import static utils.UserEnum.USER_NAME;
import static utils.UserEnum.USER_PASSWORD;

public class HacerLogin implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(INP_USUARIO));
        actor.attemptsTo((Performable) theValue(USER_NAME.getValue()));
        actor.wasAbleTo(Click.on(INP_PASSWORD));
        actor.attemptsTo((Performable) theValue(USER_PASSWORD.getValue()));
        actor.wasAbleTo(Click.on(INP_LOGIN));

    }

    public static HacerLogin elementos() {
        return instrumented(HacerLogin.class);
    }

}

