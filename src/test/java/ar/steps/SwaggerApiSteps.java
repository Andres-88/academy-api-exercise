package ar.steps;

import api.config.EntityConfiguration;
import api.model.TokenCreated;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import services.CreateUserService;

import java.lang.reflect.InvocationTargetException;

public class SwaggerApiSteps extends PageSteps {
    @When("realizo una petición (.*) al entity (.*) con la siguiente request (.*)")
    public void realizoUnaPeticiónEndpointAlEntityEntityConLaSiguienteRequestRequest(String peticion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(peticion.toLowerCase(), String.class).invoke("", request);
    }

    @Then("compruebo que el status code (.*) sea el esperado")
    public void comprueboQueElStatusCodeStatusCodeEsaElEsperadoYGeneroElToken(int statusCode) {
        int actualStatusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, actualStatusCode, "The status code are not equals");
    }

    @And("guardo el Token generado")
    public void guardoElTokenGenerado() {
        TokenCreated response = (TokenCreated) APIManager.getLastResponse().getResponse();
        CreateUserService.TOKEN.set(response.getJwt());
    }
}
