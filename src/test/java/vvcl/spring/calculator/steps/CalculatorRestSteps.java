package vvcl.spring.calculator.steps;

import net.thucydides.core.annotations.Step;
import vvcl.spring.calculator.pages.CalculatorPage;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorRestSteps {

    private int currentNum ;
    CalculatorPage calculatorPage;

    @Step
    public void enters(String number) {
        calculatorPage.enter_keywords(number);
    }

    @Step
    public void current() {
        calculatorPage.current_number();
    }

    @Step
    public void add() {
        calculatorPage.add_number();
    }

    @Step
    public void subtract() {
        calculatorPage.subtract_number();
    }

    @Step
    public void accplus() {
        calculatorPage.accplus_number();
    }

    @Step
    public void accmin() {
        calculatorPage.accmin_number();
    }

    @Step
    public void should_see_text(String text) {
        assertThat(calculatorPage.getCurrent(), containsString(text));
    }

    @Step
    public void is_the_home_page() {
        calculatorPage.open();
    }

    @Step
    public void looks_for_current() {
        current();
    }

    @Step
    public void add_to_current(String term) {
        enters(term);
        add();
    }

    @Step
    public void subtract_to_current(String term) {
        enters(term);
        subtract();
    }

    @Step
    public void accumulateplus_to_current(String term) {
        enters(term);
        accplus();
    }

    @Step
    public void accumulateminus_to_current(String term) {
        enters(term);
        accmin();
    }

    @Step("get the current number")
    public void givenCurrentNumber() {
        currentNum = Integer.parseInt(when().get("/calculator/current").getBody().asString());
    }

    @Step("adding {0}")
    public void whenAddNumber(int num) {
        given()
                .param("num",num)
                .when()
                .post("/calculator/accumulate");
        currentNum = currentNum + num;
    }

    @Step("got the sum")
    public void thenSummedUp() {
        when()
                .get("/calculator/current")
                .then()
                .statusCode(200)
                .body(equalTo(String.valueOf(currentNum)));
    }


    @Step("subtracting {0}")
    public void whenSubtractNumber(int num) {
        given()
                .param("num",num)
                .when()
                .post("/calculator/accumulateS");
        currentNum = currentNum - num;
    }

    @Step("got the subtraction result")
    public void thenSubtractedUp() {
        when()
                .get("/calculator/current")
                .then()
                .statusCode(200)
                .body(equalTo(String.valueOf(currentNum)));
    }
}
