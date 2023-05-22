package co.edu.udea.certification.calidad.tasks;

import co.edu.udea.certification.calidad.interactions.BancolombiaPersonasPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
// import net.serenitybdd.screenplay.actions.Open;


public class GoToCreditsSection implements Task {

  private PageObject page;

  public GoToCreditsSection(PageObject page) {
    this.page = page;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    // actor.attemptsTo(Open.browserOn(page));
    actor.attemptsTo(BancolombiaPersonasPage.go());
  }

  public static GoToCreditsSection browser(PageObject page) {
    return Tasks.instrumented(GoToCreditsSection.class, page);
  }
  
}
