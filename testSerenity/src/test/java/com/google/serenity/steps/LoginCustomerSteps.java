package com.google.serenity.steps;

import com.google.serenity.steps.serenity.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginCustomerSteps {

    @Steps
    LoginSteps anna;

    @Given("^The Customer login page is showed$")
    public void the_customer_login_page_is_showed(){
        anna.customer_page_is_open();
    }

    @When("^The user provides a valid credential to login$")
    public void the_user_provides_a_valid_credential_to_login(){
        anna.enters_phone("0964142565");
        anna.enters_password("123123");
        anna.click_login_button();
    }

    @When("^The user provides an (.+) to login$")
    public void the_user_provides_an_to_login(String invalidpassword){
       anna.enters_phone("0964142565");
       anna.enters_password(invalidpassword);
       anna.click_login_button();
    }

    @When("^The user doesn't provide email or phone$")
    public void the_user_doesnt_provide_email_or_phone(){
        anna.enters_phone("0964142565");
        anna.click_login_button();
    }

    @When("^The user doesn't provide password$")
    public void the_user_doesnt_provide_password(){
        anna.enters_password("123123");
        anna.click_login_button();
    }

    @Then("^Homepage will be shown$")
    public void homepage_will_be_shown(){
        anna.should_see_customer_page_is_open("Tạo Đơn Hàng");
    }

    @Then("^The message \"([^\"]*)\" will be showed$")
    public void the_message_something_will_be_showed(List<String> list1){
        anna.error_text_is_showed(list1.get(0));
    }


}
