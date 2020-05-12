package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequest extends TestBase {

    @Test
    public void deleteRecordSuccussfully() {

        given()
                .log()

                .uri()
                .when()
                .delete("/api/users/2")

                .then()
                .log()
                .body()
                .statusCode(204);


    }


}
