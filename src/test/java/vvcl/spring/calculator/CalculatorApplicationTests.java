package vvcl.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
class CalculatorApplicationTests {

    @Test
    public void testCalculator() {
        when()
                .get("/adder/current")
                .then()
                .statusCode(200)
                .body(equalTo("0"));

        given()
                .param("num",5)
                .when()
                .post("/adder/add")
                .then()
                .body(equalTo("5"));

        given()
                .param("num",10)
                .when()
                .post("/adder/accumulate")
                .then()
                .body(equalTo("10"));

        when()
                .get("/adder/current")
                .then()
                .statusCode(200)
                .body(equalTo("10"));

        given()
                .param("num",5)
                .when()
                .post("/substractor/accumulateS")
                .then()
                .body(equalTo("5"));
    }

}
