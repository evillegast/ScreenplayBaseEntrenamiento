package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.HomePage.*;

public class HacerClickElementos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Click.on(INP_USUARIO));
        actor.wasAbleTo(Click.on(INP_PASSWORD));
        actor.wasAbleTo(Click.on(INP_LOGIN));



    }


}

