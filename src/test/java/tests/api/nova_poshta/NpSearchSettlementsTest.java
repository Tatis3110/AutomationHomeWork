package tests.api.nova_poshta;

import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;
import tests.api.privat24.BaseApiTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class NpSearchSettlementsTest extends BaseApiTest {
    private final static String API_KEY = "[ВАШ КЛЮЧ]";
    private Map<String, Object> reqBody = new HashMap<>();

    @Before
    public void setReqBody(){
        Map<String, Object> methodProperties = new HashMap<>();

        methodProperties.put("CityName", "київ");
        methodProperties.put("Limit", 5);

        reqBody.put("calledMethod", "searchSettlements");
        reqBody.put("methodProperties", methodProperties);
        reqBody.put("modelName", "Address");
        reqBody.put("apiKey", API_KEY);

    }

    @Test
    public void checkSettlements (){
        given()
                .spec(this.reqspec)
                .baseUri("http://testapi.novaposhta.ua/v2.0")
                .body(this.reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post("/json/Address/searchSettlements/")
                .then()
                .spec(this.resspec)
                .body(
                        matchesJsonSchema(
                                new File(System.getProperty("user.dir") +
                                         "/src/main/resources/validators/np_address_schema.json")));
    }


}

