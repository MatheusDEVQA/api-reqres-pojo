package support.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import support.dominio.User;

import static io.restassured.RestAssured.given;

public class Request {

    public static Response response;

    public static void postRequestBodyContentJsonUri(String path, int statusCode, User body) {
        response = given()
                .contentType(ContentType.JSON)
                .body(body).log().all()
                .when()
                .post("https://reqres.in" + path)
                .then()
                .statusCode(statusCode)
                .extract().response();
    }
}
