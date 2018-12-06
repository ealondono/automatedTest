package co.com.eafit.definitions;

import co.com.eafit.steps.katalonStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class KatalonDefinition {
	@Steps
	
	katalonStep katalonStep;

	@Given("^quiero validar obligatoriedad del nombre$")
	public void quieroValidarObligatoriedadDelNombre() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		katalonStep.abrirPagina();
	}


	@When("^no escribo el nombre$")
	public void noEscriboElNombre() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^devo ver el mensaje This field is required$")
	public void devoVerElMensajeThisFieldIsRequired() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}	

}
