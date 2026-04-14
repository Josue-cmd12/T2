package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class AddToCart {
    public static Performable elProducto(String nombreProducto){
        return Task.where("{0} agregar al carrito el producto '" + nombreProducto + "'",
                Click.on(Target.the("boton agregar " + nombreProducto)
                        .locatedBy(CarritoPage.botonAgregar((nombreProducto))))
        );
    }
}
