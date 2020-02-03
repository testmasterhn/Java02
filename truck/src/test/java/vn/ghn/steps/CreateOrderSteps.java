package vn.ghn.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.ghn.steps.serenity.CustomerSteps;

import static vn.ghn.Data.CreateOrder.*;

public class CreateOrderSteps {
    @Steps
    CustomerSteps anna;

    @Given("^The user login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_login_with_username_and_password(String phone, String and_password){
        anna.open_customer_page().then_login_with(phone,and_password);
    }

    @And("^I am on Create Order form$")
    public void i_am_on_create_order_form(){
        anna.see_menu_create_order();
    }

    @When("^I input all field of order form and submit$")
    public void i_input_all_field_of_order_form_and_submit(){
        anna.enters_address_sender(SENDERADDRESS).then_hit_enter()
                .enters_name_sender(SENDERNAME).enters_phone_sender(SENDERPHONE)
                .enters_address_receiver(RECEIVERADDRESS).then_hit_enter()
                .enters_name_receiver(RECEIVERNAME).enters_phone_receiver(RECEIVERPHONE)
                .enters_external_code(EXTERNALCODE).enters_tracking_code(TRACKINGCODE)
                .enters_total_items(TOTALITEMS).enters_weight(WEIGHT)
                .enters_DRC(D, R, C)
                .enters_cubic(CUBIC).check_converted_weight()
                .enters_content(CONTENT).enters_note(NOTE)
                .clicks_check_fee().clicks_lift_fee().clicks_value_fee()
                .then_enters_cod(COD).then_enters_value(VALUE)
                .then_check_lift_weight().and_enters_check_items(CHECKITEMS)
                .click_button_add_paper().then_enter_paper_description(PAPERDESC)
                .click_button_return_add_paper().then_enter_return_paper_description(RETURNPAPERDESC)
                .then_check_order_fee()
                .then_click_submit_button().and_see_popup_confirmation()
                .then_check_order_info_again()
                .then_click_confirm_button_in_popup();
    }

    @When("^I don't input required field and submit$")
    public void i_dont_input_required_field_and_submit(){
        anna.enters_note(NOTE).then_enters_cod(COD).then_click_submit_button();
    }

    @When("^I input all field but (.+) or (.+) or (.+) = 0$")
    public void i_input_all_field_but_or_or_0(String weight, String numberofitems, String cubic){
        anna.enters_address_sender(SENDERADDRESS).then_hit_enter()
                .enters_name_sender(SENDERNAME).enters_phone_sender(SENDERPHONE)
                .enters_address_receiver(RECEIVERADDRESS).then_hit_enter()
                .enters_name_receiver(RECEIVERNAME).enters_phone_receiver(RECEIVERPHONE)
                .enters_external_code(EXTERNALCODE).enters_tracking_code(TRACKINGCODE)
                .enters_total_items(numberofitems).enters_weight(weight)
                .enters_DRC(D, R, C)
                .enters_cubic(cubic).check_converted_weight()
                .enters_content(CONTENT).enters_note(NOTE)
                .clicks_check_fee().clicks_lift_fee().clicks_value_fee()
                .then_enters_cod(COD).then_enters_value(VALUE)
                .then_check_lift_weight().and_enters_check_items(CHECKITEMS)
                .click_button_add_paper().then_enter_paper_description(PAPERDESC)
                .click_button_return_add_paper().then_enter_return_paper_description(RETURNPAPERDESC)
                .then_check_order_fee()
                .then_click_submit_button().and_see_popup_confirmation()
                .then_check_order_info_again()
                .then_click_confirm_button_in_popup();
    }

    @Then("^Order info will be opened in a new tab$")
    public void order_info_will_be_opened_in_a_new_tab(){
        anna.see_new_tab_is_opened();
    }

    @Then("^All required field are red and show warning message$")
    public void all_required_field_are_red_and_show_warning_message(){
        anna.see_warning_messages_for_required_fields();
    }

    @Then("^Error popup appears$")
    public void error_popup_appears() {
        anna.see_error_message("Tạo đơn hàng không thành công");
    }
}
