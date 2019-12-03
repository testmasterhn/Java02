package com.google.serenity.steps.serenity;

import com.google.serenity.pages.CustomerPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    CustomerPage customerPage;

    @Step
    public void error_text_is_showed(String errorText){
        Assert.assertEquals(customerPage.getErrorText(), errorText);
    }

    @Step
    public void customer_page_is_open(){
        customerPage.open();
    }

    @Step
    public void enters_phone(String phone) {
        customerPage.enter_phone(phone);
    }

    @Step
    public void enters_password(String password) {
        customerPage.enter_password(password);
    }

    @Step
    public void click_login_button(){
        customerPage.click_submit_button();
    }

    @Step
    public void should_see_customer_page_is_open(String createOrderText) {
        Assert.assertEquals(customerPage.getCreateOrderText(), createOrderText);
    }
}