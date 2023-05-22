package co.edu.udea.certification.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certification.calidad.userinterfaces.UserPage.SIMULATE_CREDIT_OPTION;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.CONTINUE_BUTTON;


public class CreditsSectionPage implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    // hacer click sobre la opcion simular creditos de libre inversion
    actor.attemptsTo(Click.on(SIMULATE_CREDIT_OPTION));
    // hacer click sobre el boton continuar
    actor.attemptsTo(Click.on(CONTINUE_BUTTON));
  }

  public static CreditsSectionPage go() {
    return Tasks.instrumented(CreditsSectionPage.class);
  }
  
}
