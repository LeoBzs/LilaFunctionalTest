package LilaTest;

import LilaMain.HashInvalido;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class HashInvalidoTestCase extends HashInvalido {

    @Test
    public void cepInvalidoTestCase(){

        given()
                .spec(requestSpec)
                .log().all()
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .log().all();
    }
}
