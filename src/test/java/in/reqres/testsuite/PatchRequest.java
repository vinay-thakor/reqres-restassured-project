package in.reqres.testsuite;

import in.reqres.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchRequest extends TestBase {

    @Test
    public void singleFieldJobUpdateSuccessfully() {

        Pojo pojo = new Pojo();

        pojo.setJob("Tester");

        given()

                .when()
                .body(pojo)
                .patch("/api/user/2")


                .then()
                .log()
                .body()
                .statusCode(200);

    }
}
