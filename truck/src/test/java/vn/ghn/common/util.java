package vn.ghn.common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class util extends PageObject {
    public void switch_to_new_window(){
        this.waitForCondition().until(ExpectedConditions.numberOfWindowsToBe(2));
        for(String winHandle : getDriver().getWindowHandles()){
            this.getDriver().switchTo().window(winHandle);
        }
    }

    public void clickToElement(By locator){
        WebElementFacade element = find(locator);
        this.waitFor(element).waitUntilClickable();
        this.clickOn(element);
    }

    public String getAlertMessage(String locator, String values){
        locator = String.format(locator, values);
        WebElementFacade element = find(By.xpath(locator));
        this.waitFor(element).waitUntilVisible();
        return element.getText();
    }

    public void enterTextIntoElement(String locator, String sendkeyvalue, String... values) {
        locator = String.format(locator, (Object[]) values);
        WebElementFacade element = find(By.xpath(locator));
        element.clear();
        this.enter(sendkeyvalue).into(element);
    }


}
