package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.questions.TheCheckout;
import edu.pe.cibertec.saucedemo.tasks.CheckSummary;
import edu.pe.cibertec.saucedemo.tasks.CompleteCheckout;
import edu.pe.cibertec.saucedemo.ui.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class CheckoutStepDefinitions {

    @And("she proceeds to checkout with first name {string}, last name {string} and postal code {string}")
    public void sheProceedsToCheckout(String firstName, String lastName, String postalCode){
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteCheckout.conDatos(firstName, lastName, postalCode)
        );
    }
    @And("she verifies the order summary shows item total {string}")
    public void sheVerifiesTheOrderSummary(String expectedTotal){
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckSummary.conElTotal(expectedTotal)
        );
    }
    @And("she completes the order")
    public void sheCompletesTheOrder(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(Target.the("finalizar boton").locatedBy(CheckoutPage.BOTON_FINISH))
        );
    }
    @Then("she should see the confirmation message {string}")
    public void sheShouldSeeConfirmation(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCheckout.confirmationMessage(), equalTo(message))
        );
    }
    @And("the checkout form should remain visible")
    public void formShouldRemainVisible(){
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCheckout.formIsVisible(), is(true))
        );
    }
}
