package co.com.eafit;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
/*@CucumberOptions (features = "src/test/resources/features/metis/login.feature", 
				  tags = "@login",
				  glue = "co.com.eafit.definitions",
				  snippets = SnippetType.CAMELCASE )
*/

@CucumberOptions (features = "src/test/resources/features/Eafit/contactenos.feature", 
tags = "@Comentario",
glue = "co.com.eafit.definitions",
snippets = SnippetType.CAMELCASE )
				  

public class RunnerTagsContactenos {

}
