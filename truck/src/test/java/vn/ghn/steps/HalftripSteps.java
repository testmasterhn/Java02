package vn.ghn.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.ghn.steps.serenity.OpsSteps;

public class HalftripSteps {
    @Steps
    OpsSteps anna;

    @Given("^The ops login with id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_ops_login_with_id_something_and_password_something(String id, String password) {
        anna.open_ops_page().then_login_with(id, password);
    }

    @Then("^The successful message \"([^\"]*)\" will be appeared$")
    public void the_successful_message_will_be_appeared(String mess){
        anna.see_successful_message(mess);
    }

    @And("^I am on Create HalfTrip page$")
    public void i_am_on_create_halftrip_page() {
        anna.see_create_halftrip_menu();
    }

    @When("^I create trip without assigning order$")
    public void i_create_trip_without_assigning_order(){
        anna.click_button_choose_driver_and_truck().and_choose_truck_and_driver().then_click_submit_button()
                .click_create_trip_button().then_click_submit_button();
    }

    @When("^I create trip with changed truck driver without assigning order$")
    public void i_create_trip_with_changed_truck_driver_without_assigning_order(){
        anna.click_button_choose_driver_and_truck().and_choose_truck_and_driver()
                .choose_truck_and_driver_again()
                .then_click_submit_button().then_click_submit_button()
                .click_create_trip_button().then_click_submit_button();
    }

    @And("^I open trip detail$")
    public void i_open_trip_detail(){
        anna.open_list_of_halftrip_page().and_start_trip().then_open_trip_detail_page();
    }

    @And("^I finish trip$")
    public void i_finish_trip(){
       // anna.;
    }


}
