package co.com.eafit.steps;

import co.com.eafit.pageobject.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
	LoginPage loginPage;

	@Step
	public void abrirPagina() {
		// TODO Auto-generated method stub
		loginPage.open();
		
	}
	
	@Step
	public void ingresarCredenciales(String user, String pass) {
		// TODO Auto-generated method stub
		loginPage.realizarLogin(user,pass);
	}

	public void accesoExitoso(String tituloPagina) {
		// TODO Auto-generated method stub
		loginPage.accesoExitoso(tituloPagina);
	}

}
