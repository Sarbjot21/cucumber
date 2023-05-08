package org.visa.learning.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.visa.learning.model.Calculator;

public class CalculatorTestStepDefinition {
    Calculator calculator;
    Integer result;
    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        result = calculator.add(arg1,arg2);
    }

    @Then("^I should get (\\d+)$")
    public void i_should_get(Integer arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(result,arg1);
    }
}
