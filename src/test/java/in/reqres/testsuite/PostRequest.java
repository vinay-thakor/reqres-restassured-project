package in.reqres.testsuite;

import in.reqres.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class PostRequest extends TestBase {

    @Test
    public void createStudent() {

        Pojo pojo = new Pojo();

        pojo.setName("whoare");
        pojo.setJob("younow");
        pojo.setEmail("abcd123@gail.com");
        pojo.setPassword("a12444");

        given()
                .log()
                .body()

                .when()
                .body(pojo)
                .post("/users")

                .then()
                .log()
                .body()
                .statusCode(201);


    }

    @Test

    public void createStudentRegisterSuccussfully() {

        Pojo pojo = new Pojo();

        pojo.setName("whoare");
        pojo.setJob("younow");
        pojo.setEmail("abcd123@gail.com");
        pojo.setPassword("a12444");

        given()
                .log()
                .body()

                .when()
                .body(pojo)
                .post("/api/register")

                .then()
                .log()
                .body()
                .statusCode(201);


    }

    @Test
    public void createStudentRegisterUnsuccussfully() {

        Pojo pojo = new Pojo();

        pojo.setName("whoare");
        pojo.setJob("younow");
        pojo.setEmail("abcd123@gail.com");
        pojo.setPassword("a12444");

        given()
                .log()
                .body()

                .when()
                .body(pojo)
                .post("/api/register")

                .then()
                .log()
                .body()
                .statusCode(400);


    }


    @Test

    public void createStudentLoginSuccussfully() {

        Pojo pojo = new Pojo();

        pojo.setName("Prime");
        pojo.setJob("numberone");
        pojo.setEmail("abcd1245@gail.com");
        pojo.setPassword("a124433");

        given()
                .log()
                .body()

                .when()
                .body(pojo)
                .post("/api/login")

                .then()
                .log()
                .body()
                .statusCode(201);


    }

    @Test
    public void createStudentLoginUnSuccussfully() {

        Pojo pojo = new Pojo();

        pojo.setName("whoare");
        pojo.setJob("younoww");
        pojo.setEmail("abecd123@gail.com");
        pojo.setPassword("a172444");

        given()
                .log()
                .body()

                .when()
                .body(pojo)
                .post("/api/login")

                .then()
                .log()
                .body()
                .statusCode(400);


    }


}