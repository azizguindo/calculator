package vvcl.spring.calculator;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CalculatorIntegrationTest extends SerenityStories {

    @BeforeStories
    public void init() {
        System.out.println("------------------------------STARTING------------------------------");
    }

    @AfterStories
    public void end() {
        System.out.println("------------------------------ENDING------------------------------");
    }
}
