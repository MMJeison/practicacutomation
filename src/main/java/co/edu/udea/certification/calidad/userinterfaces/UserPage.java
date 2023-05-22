package co.edu.udea.certification.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bancolombia.com/personas")
public class UserPage extends PageObject {
  
  public static final Target CLOSE_MODAL_BUTTON = Target.the("Close modal button").locatedBy("//*[@id='closeModalBtn']/span");
  
  public static final Target PRODUCTS_AND_SERVICES = Target.the("Products and services").locatedBy("//*[@id='menu-productos']");
  
  public static final Target CREDITS_MENU = Target.the("Credits menu").locatedBy("//*[@id='header-productos-creditos']");

  public static final Target SIMULATE_CREDIT_OPTION = Target.the("Simulate credit option").locatedBy("//*[@id='creditos']/div/div[1]/div[4]/div/div[2]/div/a[1]");

  public static final Target CONTINUE_BUTTON = Target.the("Continue button").locatedBy("//*[@id='boton-seleccion-tarjeta']");

  public static final Target YES_RADIO_BUTTON = Target.the("Yes radio button").locatedBy("//*[@id='opcion-si']");

  public static final Target CREDIT_AMOUNT = Target.the("Credit amount").locatedBy("//*[@id='valor-simulacion']");

  public static final Target CREDIT_TERM = Target.the("Credit term").locatedBy("//*[@id='valor-plazo']");

  public static final Target INPUT_BORN_DATE = Target.the("Born date").locatedBy("//*[@id='campo-fecha']");

  public static final Target BORN_YEAR = Target.the("Born year").locatedBy("//*[@id='mat-datepicker-0']/div/mat-multi-year-view/table/tbody/tr[4]/td[2]/div[1]");
  
  public static final Target BORN_MONTH = Target.the("Born month").locatedBy("//*[@id='mat-datepicker-0']/div/mat-year-view/table/tbody/tr[3]/td[3]/div[1]");

  public static final Target BORN_DAY = Target.the("Born day").locatedBy("//*[@id='mat-datepicker-0']/div/mat-month-view/table/tbody/tr[4]/td[3]/div[1]");

  public static final Target SIMULATE_BUTTON = Target.the("Simulate button").locatedBy("//*[@id='boton-simular']");

  public static final Target TEXT_VALIDATION = Target.the("Text validation").locatedBy("//*[@id='layoutContainers']/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");

}
