package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest extends TestBase {

    @Test

    public void getAllUserList() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());

    }
    @Test
    public void getSingleUser(){
        Response response = given()
                .when()
                .get("/users/2");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());

    }
    @Test
    public void getSingleUserNotFound(){
        Response response = given()
                .when()
                .get("/users/23");
                response.then().statusCode(404);
        System.out.println(response.prettyPrint());
    }


}
