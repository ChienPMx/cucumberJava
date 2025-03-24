package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class ReqresAPISteps {

    Response response;

    @When("I send a GET request to {string}")
    public void i_send_a_get_request(String endpoint) {
        response = given()
                .baseUri("https://reqres.in")
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    @When("I send a PUT request to {string} with body:")
    public void i_send_a_put_request(String endpoint, String body) {
        response = given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response should contain {string}: {string}")
    public void the_response_should_contain(String key, String expectedValue) {
        response.then().body(key, equalTo(expectedValue));
    }

    @Then("the response should contain {string}: {int}")
    public void the_response_should_contain_int(String key, int expectedValue) {
        response.then().body("data." + key, equalTo(expectedValue));
    }
}
