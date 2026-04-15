package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.questions.Text;
import net.serenitybdd.screenplay.playwright.questions.Visibility;

public class TheCheckout {
    public static Question<String> itemTotal(){
        return Text.of(Target.the("Items Total").locatedBy(CheckoutPage.ITEM_TOTAL));
    }
public static Question<String> confirmationMessage(){
        return Text.of(Target.the("Confirma Mensaje").locatedBy(CheckoutPage.CONFIRMATION_MESSAGE));
}
public static Question<String> errorMessage(){
        return Text.of(Target.the("mensaje error").locatedBy(CheckoutPage.ERROR_MESSAGE));
}
public static Question<Boolean> formIsVisible(){
        return Visibility.of(Target.the("contenedor checkoot").locatedBy(CheckoutPage.CHECKOUT_CONTAINER));
}
}
