package vvcl.spring.calculator.stories;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import vvcl.spring.calculator.steps.CalculatorRestSteps;


public class CalculatorFrontStory {

    @Steps
    CalculatorRestSteps restSteps;

    @Given("the user is on the Calculator page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        restSteps.is_the_home_page();
    }

    @When("the user looks up the current number")
    public void whenTheUserLooksUpTheCurrentNumber() {
        restSteps.looks_for_current();
    }

    @When("the user add number '$word'")
    public void whenAddANumber(String word) {
        restSteps.add_to_current(word);
    }

    @When("the user subtract number '$word'")
    public void whenSubtractANumber(String word) {
        restSteps.subtract_to_current(word);
    }

    @When("the user accumulate + number '$word'")
    public void whenAccumulatePlusANumber(String word) {
        restSteps.accumulateplus_to_current(word);
    }

    @When("the user accumulate - number '$word'")
    public void whenAccumulateMinusANumber(String word) {
        restSteps.accumulateminus_to_current(word);
    }

    @Then("they should see the output '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        restSteps.should_see_text(definition);
    }
}
