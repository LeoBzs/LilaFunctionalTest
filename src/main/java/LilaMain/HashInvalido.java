package LilaMain;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class HashInvalido {

    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    private static final String response = "HashFormatoErrado";

    @BeforeClass
    public static void setUp(){
        buildRequestSpec();
        buildResponseSpec();
    }

    public static void buildRequestSpec(){
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://dev-coracoes-da-lila.herokuapp.com/")
                .setBasePath("/entrarmesa/" + response)
                .build();
    }

    public static void buildResponseSpec(){
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(400)
                .expectContentType(ContentType.HTML)
                .build();
    }
}
