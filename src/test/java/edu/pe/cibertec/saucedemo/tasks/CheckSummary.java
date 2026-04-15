package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.questions.TheCheckout;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CheckSummary {
    public static Performable conElTotal(String totalEsperado){
        return Task.where("{0} verifica que el total sea '" +  totalEsperado + "'",
                actor -> actor.should(
                        seeThat(TheCheckout.itemTotal(), containsString(totalEsperado))
                ));
    }
}
