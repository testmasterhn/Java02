package com.google.serenity.steps.serenity;

import com.google.serenity.pages.CustomerPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.junit.MatcherAssert.*;



public class LoginSteps {
    CustomerPage customerPage;
    @Step
    public LoginSteps see_error_text(String errorText){
        assertThat(customerPage.getErrorText(), equalTo(errorText));
        return this;
    }

    @Step
    public void open_customer_page(){
        customerPage.open();
    }

    @Step
    public LoginSteps enters_phone(String phone) {
        customerPage.enter_phone(phone);
        return this;
    }

    @Step
    public LoginSteps then_enters_password(String password) {
        customerPage.enter_password(password);
        return this;
    }

    @Step
    public LoginSteps enters_password(String password) {
        customerPage.enter_password(password);
        return this;
    }

    @Step
    public LoginSteps then_click_login_button(){
        customerPage.click_submit_button();
        return this;
    }

    @Step
    public LoginSteps should_see_customer_page_is_open(String createOrderText) {
        assertThat(customerPage.getCreateOrderText(), equalTo(createOrderText));
        return this;
    }
}