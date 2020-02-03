package vn.ghn.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.ghn.steps.serenity.OpsSteps;

public class LoginOpsSteps {
    @Steps
    OpsSteps anna;

    @Given("^The Ops login page is showed$")
    public void the_ops_login_page_is_showed() {
        anna.open_ops_page().and_page_is_redirected_to_sso();
    }

    @When("^The user provides id \"([^\"]*)\" and password \"([^\"]*)\" to login$")
    public void the_user_provides_id_something_and_password_something_to_login(String id, String password) {
        anna.input_id(id).and_input_password(password).then_click_login_button();
    }

    @When("^The user provides an (.+) and id \"([^\"]*)\" to login$")
    public void the_user_provides_an_and_id_something_to_login(String invalidpassword, String id){
        anna.input_id(id).and_input_password(invalidpassword).then_click_login_button();
    }

    @When("^The user doesn't provide id and provide password \"([^\"]*)\"$")
    public void the_user_doesnt_provide_id_and_provide_password_something(String password){
        anna.input_password(password).then_click_login_button();
    }

    @When("^The user doesn't provide password and provide id \"([^\"]*)\"$")
    public void the_user_doesnt_provide_password_and_provide_id_something(String id) {
        anna.input_id(id).then_click_login_button();
    }

    @Then("^Opspage will be shown$")
    public void opspage_will_be_shown(){
        anna.see_create_halftrip_menu();
    }

    @Then("^The error message \"([^\"]*)\" will be showed$")
    public void the_message_will_be_showed(String message) {
        anna.see_error_message(message);
    }

}
