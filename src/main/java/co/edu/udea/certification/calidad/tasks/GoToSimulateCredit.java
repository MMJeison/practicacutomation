package co.edu.udea.certification.calidad.tasks;

import co.edu.udea.certification.calidad.interactions.CreditsSectionPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
// import net.serenitybdd.screenplay.actions.Open;

public class GoToSimulateCredit implements Task {

  private PageObject page;

  public GoToSimulateCredit(PageObject page) {
    this.page = page;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    // actor.attemptsTo(Open.browserOn(page));
    actor.attemptsTo(CreditsSectionPage.go());
  } 

  public static GoToSimulateCredit browser(PageObject page) {
    return Tasks.instrumented(GoToSimulateCredit.class, page);
  }
  
}
