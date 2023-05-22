package co.edu.udea.certification.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certification.calidad.userinterfaces.UserPage.CLOSE_MODAL_BUTTON;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.PRODUCTS_AND_SERVICES;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.CREDITS_MENU;

public class BancolombiaPersonasPage implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    // cerrar modal
    actor.attemptsTo(Click.on(CLOSE_MODAL_BUTTON));
    // hacer click sobre productos y servicios
    actor.attemptsTo(Click.on(PRODUCTS_AND_SERVICES));
    // hacer click sobre el menu de creditos
    actor.attemptsTo(Click.on(CREDITS_MENU));
  }

  public static BancolombiaPersonasPage go() {
    return Tasks.instrumented(BancolombiaPersonasPage.class);
  }
  
}
