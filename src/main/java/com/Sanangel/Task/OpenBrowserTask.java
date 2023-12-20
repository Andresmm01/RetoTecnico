package com.Sanangel.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://sanangel.com.co/")
        );
    }

    public static OpenBrowserTask open(){
        return instrumented(OpenBrowserTask.class);
    }
}
