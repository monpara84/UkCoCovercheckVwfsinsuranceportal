package Uk.Co.Covercheck.Vwfsinsuranceportal;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }

    @When("^I enter valid vehicle registration number$")
    public void iEnterValidVehicleRegistrationNumber() {
        new HomePage().inputRegistrationNumber(new LoadProp().getProperty("vehicleRegNumber"));
    }

    @And("^I click on Find vehicle button$")
    public void iClickOnFindVehicleButton() {
        new HomePage().clickOnFindByButton();
    }

    @Then("^I should be able to see vehicle insurance cover information$")
    public void iShouldBeAbleToSeeVehicleInsuranceCoverInformation() {
        new Utils().assertTrueMethod("Vehicle information is not displayed",
                new HomePage().getResultRegText().contains(new LoadProp().getProperty("vehicleRegNumber")));
    }

    @When("^I enter invalid vehicle registration number$")
    public void iEnterInvalidVehicleRegistrationNumber() {
        new HomePage().inputRegistrationNumber(new LoadProp().getProperty("invalidVehicleRegNumber"));
    }
    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String arg0) {
        new Utils().assertEqualsMethod(new HomePage().getResultMessageForInvalidRegNumber(), new LoadProp().getProperty("messageForInvalidRegNumber"),
                "message is not displayed for invalid reg number");
    }

    @When("^I do not enter vehicle registration number$")
    public void iDoNotEnterVehicleRegistrationNumber() {
    }

    @Then("^I should be able to see an error message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeAnErrorMessage(String arg0) {
        new Utils().assertEqualsMethod(new HomePage().getEmpltyFieldErrorMessageText(),
                new LoadProp().getProperty("emptyFieldErrorMessage"), "Correct message is not displayed for empty field");
    }
}
