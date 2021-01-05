package tests.api.privat24;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Before;

public abstract class BaseApiTest {
    protected RequestSpecification reqspec;
    protected ResponseSpecification resspec;
    @Before
    public void setSpecs(){
        reqspec = new RequestSpecBuilder()
                .setBaseUri("https://api.privatbank.ua/p24api")
                .log(LogDetail.ALL)
                .build();
        resspec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .log(LogDetail.ALL)
                .build();

    }
}
