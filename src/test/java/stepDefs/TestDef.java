package stepDefs;

import core.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestDef {


    @Given("open page {string}")
    public void open_page(String url) {
        DriverManager.navigateTo(url);
    }

    @When("I search {string}")
    public void i_search(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Open first item")
    public void open_first_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Type should contains {string}")
    public void type_should_contains(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
