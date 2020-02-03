package vn.ghn.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.ghn.steps.serenity.CustomerSteps;

public class ImportOrderSteps {
    @Steps
    CustomerSteps anna;

    @When("^I click to button import$")
    public void i_click_to_button_import(){
        anna.click_on_import_button();
    }

    @Then("^The \"([^\"]*)\" message will appeared$")
    public void the_something_message_will_appeared(String message){
        anna.see_error_message(message);
    }

    @And("^I am on Import Order form$")
    public void i_am_on_import_order_form(){
        anna.click_on_import_menu().and_import_menu_will_be_opened();
    }

    @And("^I choose import file$")
    public void i_choose_import_file(){
        anna.choose_import_file();
    }

    @And("^I click to check button$")
    public void i_click_to_check_button(){
        anna.click_check_button();
    }

    @And("^I click to create button$")
    public void i_click_to_create_button(){
        anna.check_info_import().then_click_create_import_popup();
    }

    @And("^The page will be redirected to Import History$")
    public void the_page_will_be_redirected_to_import_history(){
        anna.see_page_redirect_to_history_import();
    }

}
