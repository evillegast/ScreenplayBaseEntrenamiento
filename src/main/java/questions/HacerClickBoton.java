package questions;

import net.serenitybdd.core.pages.WithByLocator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterfaces.CrearEmpleado.BTN_GENERO;

public class HacerClickBoton implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find((WithByLocator) BTN_GENERO).getText();

    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }


}
