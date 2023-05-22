package co.edu.udea.certification.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.certification.calidad.userinterfaces.UserPage.YES_RADIO_BUTTON;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.CREDIT_AMOUNT;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.CREDIT_TERM;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.INPUT_BORN_DATE;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.BORN_YEAR;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.BORN_MONTH;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.BORN_DAY;
import static co.edu.udea.certification.calidad.userinterfaces.UserPage.SIMULATE_BUTTON;

public class SimulationFormPage implements Interaction {

  private String creditAmount;
  private String creditTerm;

  public SimulationFormPage(String creditAmount, String creditTerm) {
    this.creditAmount = creditAmount;
    this.creditTerm = creditTerm;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    // damos click sobre el boton yes
    actor.attemptsTo(Click.on(YES_RADIO_BUTTON));
    // ingresamos el valor del monto del credito
    actor.attemptsTo(Enter.theValue(creditAmount).into(CREDIT_AMOUNT));
    // ingresamos el valor del plazo del credito
    actor.attemptsTo(Enter.theValue(creditTerm).into(CREDIT_TERM));
    // ingresamos la fecha de nacimiento
    actor.attemptsTo(Click.on(INPUT_BORN_DATE));
    actor.attemptsTo(Click.on(BORN_YEAR));
    actor.attemptsTo(Click.on(BORN_MONTH));
    actor.attemptsTo(Click.on(BORN_DAY));
    // damos click sobre el boton simular
    actor.attemptsTo(Click.on(SIMULATE_BUTTON));
  }

  public static SimulationFormPage completeWithTheData(String creditAmount, String creditTerm) {
    return Tasks.instrumented(SimulationFormPage.class, creditAmount, creditTerm);
  }

}
