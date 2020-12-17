package vvcl.spring.calculator.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:4200")
public class CalculatorPage extends PageObject {

    @FindBy(name="number")
    private WebElementFacade numberTerms;


    @FindBy(name="current")
    private WebElementFacade currentButton;

    @FindBy(name="add")
    private WebElementFacade addButton;

    @FindBy(name="sub")
    private WebElementFacade subtractButton;

    @FindBy(name="accplus")
    private WebElementFacade accplusButton;

    @FindBy(name="accmin")
    private WebElementFacade accminButton;

    public void enter_keywords(String number) {
        numberTerms.type(number);
    }

    public void current_number() {
        currentButton.click();
    }

    public void add_number() {
        addButton.click();
    }

    public void subtract_number() {
        subtractButton.click();
    }

    public void accplus_number() {
        accplusButton.click();
    }

    public void accmin_number() {
        accminButton.click();
    }

    public String getCurrent() {
        WebElementFacade current = find(By.tagName("textarea"));
        return current.getText();
    }
}
