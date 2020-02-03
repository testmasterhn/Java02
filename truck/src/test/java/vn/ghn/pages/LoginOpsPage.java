package vn.ghn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("http://staging-truck-ops.ghn.vn/#/login")
public class LoginOpsPage extends PageObject {
    @FindBy(name = "UserID")
    private WebElementFacade txtID;

    @FindBy(name = "Password")
    private WebElementFacade txtPassword;

    @FindBy(xpath = "//button[contains(@class, \"btn-primary-page\")]")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "//div[@class = \"error-forgot\"]")
    private WebElementFacade errMess;

    public String get_title(){
        waitForCondition().until(ExpectedConditions.titleIs("GHN - Express"));
        return getDriver().getTitle();
    }

    public void inputID(String id){
        this.enter(id).into(txtID);
    }

    public void inputPassword(String password){
        this.enter(password).into(txtPassword);
    }

    public void clickLoginButton(){
        this.clickOn(btnLogin);
    }

    public String get_error_message(){
        return errMess.getText();
    }

}
