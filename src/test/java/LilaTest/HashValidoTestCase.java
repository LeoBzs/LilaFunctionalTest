package LilaTest;

import LilaMain.HashValido;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class HashValidoTestCase extends HashValido {

    @Test
    public void newSimpleTestCase(){
        Response payload =
                given()
                        .spec(requestSpec)
                        .log().all()
                        .when()
                        .get()
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().response();
    }
}
