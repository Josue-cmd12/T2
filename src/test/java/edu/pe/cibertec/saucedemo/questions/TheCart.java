package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.questions.Text;

import java.util.List;


public class TheCart {
    public static Question<String>badgeCount(){
        return Text.of(Target.the("Cuenta Productos").locatedBy(CarritoPage.CONTADOR_CARRITO));
    }

    public static Question<List<String>> contents(){
        return Text.ofEach(Target.the("Lista productos del carrito").locatedBy(CarritoPage.NOMBRE_PRODUCTO_CARRITO));
    }
}
