package co.edu.udea.certification.calidad.tasks;

import co.edu.udea.certification.calidad.interactions.CreditsSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoToSimulateCredit implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    // actor.attemptsTo(Open.browserOn(page));
    actor.attemptsTo(CreditsSectionPage.go());
  } 

  public static GoToSimulateCredit browser() {
    return Tasks.instrumented(GoToSimulateCredit.class);
  }
  
}
