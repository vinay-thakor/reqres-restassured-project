package in.reqres.testsuite;

import in.reqres.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class PutRequest extends TestBase {

    @Test
    public void updateRecordSuccessfully() {
        Pojo pojo = new Pojo();
        pojo.setName("George");
        pojo.setJob("computer");
        pojo.setEmail("abced1234@gmail.com");
        pojo.setPassword("andwhy150");

        given()

                .when()
                .body(pojo)
                .put("/api/users/2")

                .then()
                .log()
                .body()
                .statusCode(200);
    }

}
