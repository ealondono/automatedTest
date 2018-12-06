package co.com.eafit.steps;

import co.com.eafit.pageobject.katalonPage;
import net.thucydides.core.annotations.Step;

public class katalonStep {
	katalonPage katalonPage;

	@Step
	public void abrirPagina() {
		// TODO Auto-generated method stub
		katalonPage.open();
	}

}
