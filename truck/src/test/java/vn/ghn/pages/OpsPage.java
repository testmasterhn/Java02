package vn.ghn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import vn.ghn.common.util;

public class OpsPage extends PageObject {
    util util;
    @FindBy(xpath = "//a[@class = \"nav-link\" and contains(@href, \"pickdelivery\")]")
    private WebElementFacade menuCreateHalf;

    @FindBy(css = "button.btn-pick-driver-truck")
    private WebElementFacade btnChooseDriverTruck;

    @FindBy(css = "div.box-driver-truck-content")
    private WebElementFacade boxChangeDriverTruck;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-truck\")])[1]")
    private WebElementFacade btnTruck;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-truck\")])[2]")
    private WebElementFacade btnTruck2;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-driver\")])[1]")
    private WebElementFacade btnDriver;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-driver\")])[2]")
    private WebElementFacade btnDriver2;

    @FindBy(xpath = "//button[@class = \"btn btn-primary\" ]")
    private WebElementFacade btnSubmit;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-truck\")])[1]/h5")
    private static WebElementFacade truckNumberInList;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-truck\")])[1]/b")
    private static WebElementFacade truckWeightInList;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-truck\")])[1]/small")
    private static WebElementFacade truckPartnerInList;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-driver\")])[1]/h6")
    private static WebElementFacade driverNameInList;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-driver\")])[1]/b")
    private static WebElementFacade driverPhoneInList;

    @FindBy(xpath = "(//button[contains(@class, \"btn-square-driver\")])[1]/small")
    private static WebElementFacade driverPartnerInList;

    @FindBy(css = "div.truck-content>div.truck-id-number")
    private static WebElementFacade truckNumber;

    @FindBy(css = "div.truck-content>div>span")
    private static WebElementFacade truckWeight;

    @FindBy(css = "div.truck-content>div:last-child")
    private static WebElementFacade truckPartner;

    @FindBy(css = "div.driver-content>div.truck-id-number")
    private static WebElementFacade driverName;

    @FindBy(css = "div.driver-content>div:last-child")
    private static WebElementFacade driverPhone;

    String xpathAlertMessage = "//div[contains(text(), \"%s\")]";
    private By btnCreateTrip = By.cssSelector("button.btn-action-booking");

    @FindBy(xpath = "//a[text() = \"Danh sách chuyến\"]")
    private WebElementFacade menuListTripLog;

    @FindBy(xpath = "//a[@href = \"#/trip/half\"]")
    private WebElementFacade menuListTripHalf;

    private By tabOntrip = By.xpath("//a[text() = \"ĐANG CHẠY\"]");

    @FindBy(xpath = "(//div[@class = \"tab-pane active\"]" +
            "//div[@class = \"table-responsive\"]" +
            "//button[text() = \"Bắt đầu\"])[1]")
    private WebElementFacade btnStartTripInList;

    private By btnTripDetail = By.xpath("(//div[contains(@class, \"tab-pane active\")]" +
            "//div[@class = \"table-responsive\"]" +
            "//button[text() = \"Xem chi tiết\"])[1]");

    public String get_create_half_menu_title(){
        return menuCreateHalf.getText();
    }

    public void click_button_choose_driver_and_truck(){
        this.waitFor(btnChooseDriverTruck).waitUntilClickable();
        this.clickOn(btnChooseDriverTruck);
    }

    public void choose_truck(){
        this.waitFor(btnTruck).waitUntilClickable();
        this.clickOn(btnTruck);
        this.waitFor(truckWeightInList).waitUntilVisible();
        this.waitFor(truckPartnerInList).waitUntilVisible();
    }

    public void choose_driver(){
        this.waitFor(btnDriver).waitUntilClickable();
        this.clickOn(btnDriver);
        this.waitFor(driverNameInList).waitUntilVisible();
        this.waitFor(driverPhoneInList).waitUntilVisible();
    }

    public void click_submit_button(){
        this.waitFor(btnSubmit).waitUntilClickable();
        this.clickOn(btnSubmit);
    }

    public String get_message_content(String text){
        return util.getAlertMessage(xpathAlertMessage, text);
    }

    public void click_create_trip_button(){
        this.util.clickToElement(btnCreateTrip);
    }

    public void choose_truck_2(){
        this.waitFor(btnTruck2).waitUntilClickable();
        this.clickOn(btnTruck2);
    }

    public void choose_driver_2(){
        this.waitFor(btnDriver2).waitUntilClickable();
        this.clickOn(btnDriver2);
    }

    public void click_to_box_truck_driver(){
        this.waitFor(boxChangeDriverTruck).waitUntilClickable();
        this.clickOn(boxChangeDriverTruck);
    }

    public static String get_truck_number(){
        return truckNumber.getText();
    }

    public static String get_truck_weight_in_list(){
        return truckWeightInList.getText();
    }

    public static String get_truck_weight(){
        return truckWeight.getText();
    }

    public static String get_truck_partner_in_list(){
        return truckPartnerInList.getText();
    }

    public static String get_truck_partner(){
        return truckPartner.getText();
    }

    public static String get_driver_name_in_list(){
        return driverNameInList.getText();
    }

    public static String get_driver_name(){
        return driverName.getText();
    }

    public static String get_driver_phone_in_list(){
        return driverPhoneInList.getText();
    }

    public static String get_driver_phone(){
        return driverPhone.getText();
    }

    public void click_to_dropdown_menu_list_trip(){
        this.waitFor(menuListTripLog).waitUntilClickable();
        this.clickOn(menuListTripLog);
    }

    public void click_to_menu_list_halftrip(){
        this.waitFor(menuListTripHalf).waitUntilClickable();
        this.clickOn(menuListTripHalf);
    }

    public void click_to_start_trip_button(){
        this.waitFor(btnStartTripInList).waitUntilClickable();
        this.clickOn(btnStartTripInList);
    }

    public void click_to_ontrip_tab(){
        this.util.clickToElement(tabOntrip);
    }

    public void click_to_trip_detail_button(){
        Boolean x = false;
        this.waitForCondition().until(ExpectedConditions.attributeToBe(
                tabOntrip,
                "class",
                "active nav-link"
        ));
        System.out.println(find(btnTripDetail).getText());
        this.util.clickToElement(btnTripDetail);
    }

}