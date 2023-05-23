package co.edu.udea.certification.calidad.tasks;

import co.edu.udea.certification.calidad.interactions.BancolombiaPersonasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class GoToCreditsSection implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(BancolombiaPersonasPage.go());
  }

  public static GoToCreditsSection browser() {
    return Tasks.instrumented(GoToCreditsSection.class);
  }
  
}
