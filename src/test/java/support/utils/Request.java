package support.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import support.dominio.User;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static support.base.Environments.BASE_URL;

public class Request {

    public static Response response;

    public static void postRequestBodyContentJsonUri(String path, int statusCode, User body, String schema) {
        response = given()
                .contentType(ContentType.JSON)
                .body(body).log().all()
                .when()
                .post(BASE_URL + path)
                .then()
                .assertThat().body(matchesJsonSchemaInClasspath("schemas/"+schema+"Schema.json"))
                .statusCode(statusCode)
                .extract().response();
    }
}
