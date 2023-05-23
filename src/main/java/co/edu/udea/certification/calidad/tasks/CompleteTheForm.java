package co.edu.udea.certification.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import co.edu.udea.certification.calidad.interactions.SimulationFormPage;

public class CompleteTheForm implements Task {

  private String creditAmount;
  private String creditTerm;

  public CompleteTheForm(String creditAmount, String creditTerm) {
    this.creditAmount = creditAmount;
    this.creditTerm = creditTerm;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(SimulationFormPage.completeWithTheData(creditAmount, creditTerm));
  }

  public static CompleteTheForm browserWithTheData(String creditAmount, String creditTerm) {
    return Tasks.instrumented(CompleteTheForm.class, creditAmount, creditTerm);
  }

}
