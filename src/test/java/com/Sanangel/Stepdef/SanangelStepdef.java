package com.Sanangel.Stepdef;

import com.Sanangel.Question.Validate;
import com.Sanangel.Task.HomeTask;
import com.Sanangel.Task.OpenBrowserTask;
import com.Sanangel.Task.SelectproductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SanangelStepdef {

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("that the user opens the browser and searches for a product through the search bar.")
    public void thatTheUserOpensTheBrowserAndSearchesForAProductThroughTheSearchBar() {
        theActorCalled("usuario").wasAbleTo(
                OpenBrowserTask.open(),
                HomeTask.search()
        );

    }
    @When("the user can select two products randomly with different quantities and add them to the cart.")
    public void theUserCanSelectTwoProductsRandomlyWithDifferentQuantitiesAndAddThemToTheCart() {
        theActorCalled("usuario").wasAbleTo(
                SelectproductTask.select()
        );
    }
    @Then("the user should be able to view the products in the shopping cart.")
    public void theUserShouldBeAbleToViewTheProductsInTheShoppingCart() {
        theActorInTheSpotlight().should(
                seeThat(
                        Validate.validate(), Matchers.equalTo(true)
                )
        );

    }
}
