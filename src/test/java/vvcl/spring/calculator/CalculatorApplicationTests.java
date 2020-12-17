package vvcl.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CalculatorApplicationTests {

    @Test
    void testCalculator() {
        when()
                .get("/calculator/current")
                .then()
                .statusCode(200)
                .body(equalTo("0"));

        given()
                .param("num",5)
                .when()
                .post("/calculator/add")
                .then()
                .body(equalTo("5"));

        given()
                .param("num",10)
                .when()
                .post("/calculator/accumulate")
                .then()
                .body(equalTo("10"));

        when()
                .get("/calculator/current")
                .then()
                .statusCode(200)
                .body(equalTo("10"));

        given()
                .param("num",5)
                .when()
                .post("/calculator/accumulateS")
                .then()
                .body(equalTo("5"));
    }

}
