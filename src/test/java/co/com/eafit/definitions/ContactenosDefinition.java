package co.com.eafit.definitions;

import co.com.eafit.steps.ContactenosStep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactenosDefinition {
	@Steps
	ContactenosStep contactenosStep;

	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		contactenosStep.abrirPagina();
		
	}


	@When("^el diligencia el comentario$")
	public void elDiligenciaElComentario(DataTable dtDatos) throws Exception {
		contactenosStep.diligenciarComentario(dtDatos);
	}

	@Then("^el visualiza el pantalla el mensaje (.*)$")
	public void elVisualizaElPantallaElMensajeMuchasGraciasPorSuComentario(String mensajeExitoso) throws Exception {
		contactenosStep.mensajeComentarioExitoso(mensajeExitoso);
	}
}
