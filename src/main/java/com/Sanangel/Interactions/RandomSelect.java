package com.Sanangel.Interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Random;


import static com.Sanangel.UI.SelectproductUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RandomSelect implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int i=1;

        while(actor.recall("product"+i) != null){
            i++;
        }
        List<WebElementFacade> listProduct = LNK_Rosas.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listProduct.size());
        actor.remember("product"+i,listProduct.get(indexRandom).getText());
        while (actor.recall("product"+i) == actor.recall("product"+(i-1))){
            indexRandom = random.nextInt(listProduct.size());
            actor.remember("product"+1,listProduct.get(indexRandom).getText());
        }

        actor.attemptsTo(
                Click.on(listProduct.get(indexRandom))
        );

    }



    public static Performable click() {return instrumented(RandomSelect.class);
    }
}




