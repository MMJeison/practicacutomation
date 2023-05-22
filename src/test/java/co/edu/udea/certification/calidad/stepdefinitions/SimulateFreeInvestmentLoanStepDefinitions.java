package co.edu.udea.certification.calidad.stepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import co.edu.udea.certification.calidad.tasks.GoToCreditsSection;
import co.edu.udea.certification.calidad.tasks.GoToSimulateCredit;
import co.edu.udea.certification.calidad.tasks.CompleteTheForm;
import co.edu.udea.certification.calidad.userinterfaces.UserPage;
import co.edu.udea.certification.calidad.questions.Validation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Cucumber.class)
public class SimulateFreeInvestmentLoanStepDefinitions {

  @Managed(driver = "chrome")
  public WebDriver driver;
  private Actor person = Actor.named("kaifer");
  private UserPage userPage;

  @Before
  public void setUp() {
    driver.manage().window().maximize();
    userPage = new UserPage();
    person.can(BrowseTheWeb.with(driver));
  }

  @Given("I am in the Bancolombia Personas online page")
  public void iAmInTheBancolombiaPersonasOnlinePage() {
    // person.can(BrowseTheWeb.with(driver));
    person.attemptsTo(Open.browserOn(userPage));
  }

  @When("I enter the credits section")
  public void iEnterTheCreditsSection() {
    person.attemptsTo(GoToCreditsSection.browser(userPage));
  }

  @And("I choose the simulate free investment credit option")
  public void iChooseTheSimulateFreeInvestmentCreditOption() {
    person.attemptsTo(GoToSimulateCredit.browser(userPage));
  }

  @And("I enter all the requested information")
  public void iEnterAllTheRequestedInformation() {
    // seleccionamos una cantidad aleatoria entre 1000000 y 500000000
    String amount = String.valueOf((int) (Math.random() * 499000001 + 1000000));
    // seleccionamos un plazo aleatorio entre 48 y 84
    String term = String.valueOf((int) (Math.random() * 37 + 48));
    person.attemptsTo(CompleteTheForm.browserWithTheData(userPage, amount, term));
  }

  @Then("I can see the different options for the free investment credit")
  public void iCanSeeTheDifferentOptionsForTheFreeInvestmentCredit() {
    // person.should(seeThat(Validation.theOptionsCredits()));
    String message = "Te ofrecemos estas opciones para Crédito de Libre Inversión";
    person.should(seeThat(Validation.theOptionsCredits(message), equalTo(true)));
  }

}
