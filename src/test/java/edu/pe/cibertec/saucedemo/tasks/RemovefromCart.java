package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class RemovefromCart {
    public static Performable elProducto(String nombreProducto){
        return Task.where("{0} elimina el producto del carrito '" + nombreProducto + "'",
                Click.on(Target.the("boton eliminar " + nombreProducto).locatedBy(CarritoPage.botonEliminar(nombreProducto)))
        );
    }
}
