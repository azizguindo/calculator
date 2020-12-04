package vvcl.spring.calculator.stories;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import vvcl.spring.calculator.steps.CalculatorRestSteps;

public class AdderStory {

    @Steps
    CalculatorRestSteps restSteps;

    @Given("a number +")
    public void givenANumber() throws Exception{
        restSteps.givenCurrentNumber();
    }

    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num){
        restSteps.whenAddNumber(num);
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum(){
        restSteps.thenSummedUp();
    }
}
