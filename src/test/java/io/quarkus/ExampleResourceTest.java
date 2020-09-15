package io.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloMp() {
        given()
          .when().get("/hello/mp")
          .then()
             .statusCode(200)
             .body(is("hello world"));
    }

    @Test
    public void testHelloJaxrs() {
        given()
          .when().get("/hello/jaxrs")
          .then()
             .statusCode(200)
             .body(is("hello world"));
    }

}