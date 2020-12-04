package vvcl.spring.calculator.steps;


import net.thucydides.core.annotations.Step;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CalculatorRestSteps {

    private int currentNum ;

    @Step("get the current number")
    public void givenCurrentNumber() {
        currentNum = Integer.parseInt(when().get("/adder/current").getBody().asString());
    }

    @Step("adding {0}")
    public void whenAddNumber(int num) {
        given()
                .param("num",num)
                .when()
                .post("/adder/accumulate");
        currentNum = currentNum + num;
    }

    @Step("got the sum")
    public void thenSummedUp() {
        when()
                .get("/adder/current")
                .then()
                .statusCode(200)
                .body(equalTo(String.valueOf(currentNum)));
    }


    @Step("substracting {0}")
    public void whenSubstractNumber(int num) {
        given()
                .param("num",num)
                .when()
                .post("/substractor/accumulateS");
        currentNum = currentNum - num;
    }

    @Step("got the substraction result")
    public void thenSubstractedUp() {
        when()
                .get("/adder/current")
                .then()
                .statusCode(200)
                .body(equalTo(String.valueOf(currentNum)));
    }
}
