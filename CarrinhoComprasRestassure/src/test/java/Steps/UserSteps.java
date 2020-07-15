package Steps;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.Assert;
import br.com.automacao.entity.User;
import br.com.automacao.factory.UserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class UserSteps {

	public Response response;
	final private String baseURI = "https://www.interzoid.com/services/getweathercity";
	final private String basePath = "/api/getweathercity";
	User user;

	@Before(order = 1, value = { "@api" })
	public void setUp() {
		RestAssured.baseURI = baseURI;
		RestAssured.basePath = basePath;
	}

	@After(order = 1, value = {"@api"})	
	@Given("^efetuo o cadastro de usuario$")
	public void efetuo_o_cadastro_de_usuario() throws Throwable {
	    user = UserFactory.obterUsuarioValido();
		response = 
				given()
				      .log().all()
                      .contentType("application/json")
                      .body(user) 
				.when()
				      .post("/create")
				.then()
				      .body("status", Matchers.is("success"))
                      .log().all()
                      .extract()
                      .response();
	}

	@When("^verifico o retorno$")
	public void verifico_o_retorno() throws Throwable {
	   	Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals("success",response.jsonPath().get("status"));
		
	}

	@When("^cunsultar usuario$")
	public void cunsultar_usuario() throws Throwable {
		//POST /tasks com valores faltando retornar status de requisição inválida HTTP Status 400
        given()
                .log().all()
        .when()
                .post("/register")
        .then()
                .body("status", Matchers.is("sucess"))
                .log()
                .all()
                .extract()
                .response();
        ;
    }
	
	@Then("^devo obter o retorno$")
	public void devo_obter_o_retorno() throws Throwable {
		Assert.assertEquals(response.getStatusCode(), 404);
		Assert.assertEquals("Failed",response.jsonPath().get("status"));
	}

	@Then("^dados são gravados corretamente$")
	public void dados_sao_gravados_corretamente() throws Throwable {
		Assert.assertEquals(user.getLicense(), response.jsonPath().get("data.name"));
		Assert.assertEquals(user.getLicense(), response.jsonPath().get("data.email"));
		Assert.assertEquals(user.getCity(), response.jsonPath().get("data.city"));
		Assert.assertEquals(user.getState(), response.jsonPath().get("data.state"));
		
	}

}