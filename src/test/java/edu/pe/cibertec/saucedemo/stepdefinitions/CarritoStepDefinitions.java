package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.questions.TheCart;
import edu.pe.cibertec.saucedemo.tasks.AddToCart;
import edu.pe.cibertec.saucedemo.tasks.RemovefromCart;
import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;


public class CarritoStepDefinitions {

    @And("she adds the product {string} to the cart")
    public void sheAddsTheProductToTheCart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddToCart.elProducto(productName)
        );
    }
    @Then("The cart icon should display {string}")
    public void theCartIconShouldDisplay(String expectedCount) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.badgeCount(), equalTo(expectedCount))
        );
    }
    @And("the cart shouldContain{string} and {string}")
    public void theCartShouldContain(String item1,String item2){
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(Target.the("icono carrito").locatedBy(CarritoPage.ICONO_CARRITO))
        );
        OnStage.theActorInTheSpotlight().should(seeThat(TheCart.contents(), hasItems(item1, item2))
        );
    }
    @And("She removes the product {string} from the cart")
    public void sheRemovesTheProduct(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RemovefromCart.elProducto(productName)
        );
    }
    @And("the cart should only contain {string}")
    public void theCartShouldOnlyContain(String productName){
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCart.contents(), contains(productName))
        );
    }
}
