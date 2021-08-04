package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.LoginPaginaPrincipal.*;
import static utils.UserEnum.USER_NAME;
import static utils.UserEnum.USER_PASSWORD;

public class LoginPaginaPrincipal implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(INP_USUARIO));
        Enter.theValue(USER_NAME.getValue());
        actor.wasAbleTo(Click.on(INP_PASSWORD));
        Enter.theValue(USER_PASSWORD.getValue());
        Click.on(INP_LOGIN);

    }

    public static LoginPaginaPrincipal elementos() {
        return instrumented(LoginPaginaPrincipal.class);
    }

}

