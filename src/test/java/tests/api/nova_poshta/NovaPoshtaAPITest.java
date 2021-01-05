package tests.api.nova_poshta;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.http.ContentType.XML;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class NovaPoshtaAPITest extends NPBaseApiTest{
    private final static String API_KEY = System.getProperty("apiKey");
    private Map<String, Object> reqBody = new HashMap<>();

    @Before
    public void setReqBody(){
        Map<String, Object> methodProperties = new HashMap<>();

        methodProperties.put("CityName", "київ");
        methodProperties.put("Limit", 5);

        reqBody.put("modelName", "Common");
        reqBody.put("calledMethod", "getCargoTypes");
        reqBody.put("methodProperties", methodProperties);
        reqBody.put("apiKey", API_KEY);

    }


    @Test
    public void checkCargoTypesXml() {
        given()
                .spec(this.reqspec)
                .queryParam("data")
                .contentType(XML)
                .when()
                .post("/xml")
                .then()
                .spec(this.resspec)
                .assertThat()
                .body("data.@Description", hasItems(equalTo("Вантаж"),
                        equalTo("Документи"), equalTo("Шини-диски"),
                        equalTo("Палети"), equalTo("Посилка")));
    }

    @Test
    public void checkCargoTypesJson() {
        given()
                .spec(this.reqspec)
                .queryParam("data")
                .contentType(JSON)
                .when()
                .post("/json")
                .then()
                .spec(this.resspec)
                .assertThat()
                .body("data.@Description", hasItems(equalTo("Вантаж"),
                        equalTo("Документи"), equalTo("Шини-диски"), equalTo("Посилка")));
    }
}
