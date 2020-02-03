package vn.ghn.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.ghn.steps.serenity.CustomerSteps;

import java.util.List;

public class LoginCustomerSteps {
    @Steps
    CustomerSteps anna;

    @Given("^The Customer login page is showed$")
    public void the_customer_login_page_is_showed(){
        anna.open_customer_page();
    }

    @When("^The user provides phone \"([^\"]*)\" and password \"([^\"]*)\" to login$")
    public void the_user_provides_a_valid_credential_to_login(String phone, String password){
        anna.enters_phone(phone)
                .then_enters_password(password)
                .then_click_login_button();
    }

    @When("^The user provides an (.+) and phone \"([^\"]*)\" to login$")
    public void the_user_provides_an_to_login(String invalidpassword, String phone){
        anna.enters_phone(phone)
                .then_enters_password(invalidpassword)
                .then_click_login_button();
    }

    @When("^The user doesn't provide email or phone and provide password \"([^\"]*)\"$")
    public void the_user_doesnt_provide_email_or_phone(String password){
        anna.enters_password(password)
                .then_click_login_button();
    }

    @When("^The user doesn't provide password and provide phone \"([^\"]*)\"$")
    public void the_user_doesnt_provide_password(String phone){
        anna.enters_phone(phone)
                .then_click_login_button();
    }

    @Then("^Homepage will be shown$")
    public void homepage_will_be_shown(){
        anna.should_see_customer_page_is_open("Tạo Đơn Hàng");
    }

    @Then("^The message \"([^\"]*)\" will be showed$")
    public void the_message_something_will_be_showed(List<String> list1){
        anna.see_error_text(list1.get(0));
    }

}
