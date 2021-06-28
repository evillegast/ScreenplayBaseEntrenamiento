package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HacerClickBoton implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return null;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
