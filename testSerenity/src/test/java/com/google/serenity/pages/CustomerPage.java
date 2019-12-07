package com.google.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://staging-truck.ghn.vn/#/login")
public class CustomerPage extends PageObject {

    @FindBy(xpath="//input[@autocomplete=\"phone\"]")
    private WebElementFacade txtPhone;

    @FindBy(xpath="//input[@autocomplete=\"password\"]")
    private WebElementFacade txtPassword;

    @FindBy(id = "button-register-customer")
    private WebElementFacade btnLogin;

    @FindBy(className = "login-error-text")
    private WebElementFacade txtErrorLogin;

    By locatorLoginError = By.className("login-error-text");
    By locatorCreateOrderText = By.xpath("//div[@class = \"custom-title-h3\"]");


    public void enter_phone(String phone) {
        this.enter(phone).into(txtPhone);
    }

    public void enter_password(String password){
        this.enter(password).into(txtPassword);
    }

    public String getErrorText(){
        WebElementFacade txtErrorLogin = find(locatorLoginError);
        return txtErrorLogin.getText();
    }

    public void click_submit_button() {
        this.clickOn(btnLogin);
    }

    public String getCreateOrderText() {
        WebElementFacade createOrderText = find(locatorCreateOrderText);
        return createOrderText.getText();
    }
}