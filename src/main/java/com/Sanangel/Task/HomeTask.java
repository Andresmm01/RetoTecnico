package com.Sanangel.Task;

import com.Sanangel.Utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import static com.Sanangel.UI.HomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

//private final String search;
public class HomeTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Txt_busqueda),
                Enter.theValue(Data.extractData().get(0).get("Lista")).into(Txt_busqueda).thenHit(Keys.ENTER)
               // WaitUntil.the(Txt_busqueda, isVisible()).forNoMoreThan(10).seconds(), // Espera de 10 segundos
        );
    }

    public static HomeTask search(){return instrumented(HomeTask.class);}
}
