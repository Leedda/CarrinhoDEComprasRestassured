package br.com.automacao.steps;
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.apache.http.HttpStatus;

import br.com.automacao.entity.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DocString;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserSteps {
	private static final String CRIA_USUARIO_ENDPOINT = "v3/user";
	private static final String USUARIO_ENDPOINT = "v3/user/{email}";
	private Response respostaCriaUsuario;
	private User usuarioEsperado;
	
	@Before
	public void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		baseURI = "https://restapi.interzoid.com/utilities/weather/city";
		//"https://restapi.demoqa.com/utilities/weather/city"
		basePath = "/api";
		RestAssured.requestSpecification = new RequestSpecBuilder().setContentType(ContentType.JSON ).build();
		RestAssured.responseSpecification = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		
	}

	@Given("^Eu faco um POST {string} com os seguintes valores:$")
	public void eu_faco_um_post_com_os_seguintes_valores(String endpoint, Map<String, String> usuario) {  
	}

	@Given("^quando tenho esse outro usuario:$")
	public void quando_tenho_esse_outro_usuario(DocString usuario) {    
	}

	@Then("^quando faco um GET para {string}, o usuario criado é retornado$")
	public void quando_faco_um_get_para_o_usuario_criado_é_retornado(String endpoint) {   
	}

	@When("^crio um usuario$")
	public void crio_um_usuario() {
	    usuarioEsperado = new User();
	    respostaCriaUsuario =
	    given().
	       body(usuarioEsperado).
	       
	    when().
	       post(CRIA_USUARIO_ENDPOINT);
	    
	}

	@Then("^recebo o status code {int}$")
	public void recebo_o_status_code(Integer estadoHttp) {
	    assertThat(respostaCriaUsuario.statusCode(), is(estadoHttp));
	    
	}

	@Then("^o usuario foi cadastrado$")
	public void o_usuario_foi_cadastrado() {
		
	    given().
	          param("city", usuarioEsperado.getCity()).
	          param("state", usuarioEsperado.getState()).
	          param("--","--").
	    
	    when().
	          get(USUARIO_ENDPOINT).
	    
	    then().
	          statusCode(HttpStatus.SC_OK).
	          statusCode(HttpStatus.SC_NOT_FOUND).
	          statusCode(HttpStatus.SC_BAD_REQUEST).
	          body("city", is(usuarioEsperado.getCity())).
	          body("state", is(usuarioEsperado.getState())).
	          body("--", is("--"));
	}
}
