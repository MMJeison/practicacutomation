package co.edu.udea.certification.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.edu.udea.certification.calidad.userinterfaces.UserPage.TEXT_VALIDATION;

public class Validation implements Question<Boolean> {

  private String message;

  public Validation(String message) {
    this.message = message;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String aux = BrowseTheWeb.as(actor).find(TEXT_VALIDATION).getText();
    return aux.contains(message);
  }

  
  public static Validation theOptionsCredits(String message) {
    return new Validation(message);
  }

}
