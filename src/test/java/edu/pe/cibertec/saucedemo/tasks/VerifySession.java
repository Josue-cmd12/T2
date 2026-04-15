package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.playwright.abilities.BrowseTheWebWithPlaywright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class VerifySession {
    public static Performable esValida(String tituloEsperado) {
        return Task.where("{0} verifica persistencia session", actor -> {
            var page = BrowseTheWebWithPlaywright.as(actor).getCurrentPage();

            assertThat(page.locator(InventoryPage.PAGE_TITLE)).isVisible();
            assertThat(page.locator(InventoryPage.PAGE_TITLE)).containsText(tituloEsperado);
        });
    }
}
