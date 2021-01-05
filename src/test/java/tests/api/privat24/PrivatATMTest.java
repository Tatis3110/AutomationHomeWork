package tests.api.privat24;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.equalTo;


public class PrivatATMTest extends BaseApiTest {


    @Test
    public void CheckPrivatATMAPI() {
       given ()
                .spec(this.reqspec)
                .queryParam("json")
                .queryParam("atm")
                //.queryParam("address", "Украина,город Киев,улица Братиславская,дом 14Б")
                .queryParam("city", "Киев")
                .when()
                .get("/infrastructure")
                .then()
                .spec(this.resspec)
                .assertThat()
                .body("devices.type", hasItems(equalTo("ATM")),
                        "devices.cityEN", hasItems(equalTo("Kyiv")),
                        "devices.tw", hasItems(equalTo(
                                "<[{mon=08:00 - 23:00, " +
                                        "tue=08:00 - 23:00," +
                                        "wed=08:00 - 23:00," +
                                        "thu=08:00 - 23:00," +
                                        "fri=08:00 - 23:00," +
                                        "sat=08:00 - 23:00," +
                                        "sun=08:00 - 23:00," +
                                        "hol=08:00 - 23:00}]>"
         )))
               .and()
               .extract()
               .xmlPath()
               .getList("atm.device.@fullAddressUa");



        }
    }

