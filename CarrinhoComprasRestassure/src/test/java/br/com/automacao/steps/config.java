package br.com.automacao.steps;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class config {
	@Before
	public void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		baseURI = "https://api.interzoid.com";
		basePath = "/api";
		RestAssured.requestSpecification = new RequestSpecBuilder().setContentType(ContentType.JSON ).build();
		RestAssured.responseSpecification = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		
	}

}
