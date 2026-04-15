package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import edu.pe.cibertec.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;
import net.serenitybdd.screenplay.playwright.interactions.Enter;

public class CompleteCheckout {
    public static Performable conDatos(String firstName, String lastName, String postalCode) {
        return Task.where("{0} completa los datos del envio", Click.on(Target.the("icono carrito").locatedBy(CarritoPage.ICONO_CARRITO)),
                Click.on(Target.the("boton checkout").locatedBy(CheckoutPage.BOTON_CHECKOUT)),
                Enter.theValue(firstName).into(Target.the("nombre").locatedBy(CheckoutPage.FIRST_NAME)),
                Enter.theValue(lastName).into(Target.the("apellido").locatedBy(CheckoutPage.LAST_NAME)),
                Enter.theValue(postalCode).into(Target.the("codigo postal").locatedBy(CheckoutPage.POSTAL_CODE)),
        Click.on(Target.the("boton continuar").locatedBy(CheckoutPage.BOTON_CONTINUE))
        );
    }
}
