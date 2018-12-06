package co.com.eafit.steps;

import co.com.eafit.pageobject.ContactenosPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ContactenosStep {
	ContactenosPage contactenosPage;

	
	@Step
	public void abrirPagina() {
		contactenosPage.open();
	}

	@Step
	public void diligenciarComentario(DataTable dtDatos) {
		contactenosPage.nuevoComentario(dtDatos);	
	}

	public void mensajeComentarioExitoso(String mensajeExitoso) {
		contactenosPage.comentarioEnviado(mensajeExitoso);
	}

}
