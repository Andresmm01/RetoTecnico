package com.Sanangel.Task;


import com.Sanangel.Interactions.RandomSelect;
import com.Sanangel.Utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;


import static com.Sanangel.UI.HomeUI.Txt_busqueda;
import static com.Sanangel.UI.SelectproductUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;


public class SelectproductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RandomSelect.click(),
                Click.on(BTN_Quantity),
                Clear.field(BTN_Quantity),
                theValue(Data.extractData2().get(0).get("Cantidades")).into(BTN_Quantity).thenHit(Keys.ENTER),
                BackTask.Back(),
                BackTask.Back(),
                RandomSelect.click(),
                Click.on(BTN_Quantity),
                Clear.field(BTN_Quantity),
                theValue(Data.extractData2().get(1).get("Cantidades")).into(BTN_Quantity).thenHit(Keys.ENTER)
        );
    }
    public static SelectproductTask select(){
        return instrumented(SelectproductTask.class);
    }
}
