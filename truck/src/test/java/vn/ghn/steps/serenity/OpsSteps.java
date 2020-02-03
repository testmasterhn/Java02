package vn.ghn.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.ghn.pages.LoginOpsPage;
import vn.ghn.pages.OpsPage;
import vn.ghn.common.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class OpsSteps {
    LoginOpsPage loginOpsPage;
    OpsPage oP;
    util util;

    @Step
    public OpsSteps open_ops_page(){
        loginOpsPage.open();
        return this;
    }

    @Step
    public OpsSteps and_page_is_redirected_to_sso(){
        assertThat(loginOpsPage.get_title(), is(containsString("Express")));
        return this;
    }

    @Step
    public OpsSteps input_id(String id){
        loginOpsPage.inputID(id);
        return this;
    }

    @Step
    public OpsSteps and_input_password(String password){
        loginOpsPage.inputPassword(password);
        return this;
    }

    @Step
    public OpsSteps input_password(String password){
        loginOpsPage.inputPassword(password);
        return this;
    }

    @Step
    public OpsSteps then_click_login_button(){
        loginOpsPage.clickLoginButton();
        return this;
    }

    @Step
    public OpsSteps see_create_halftrip_menu(){
        assertThat(oP.get_create_half_menu_title(), is("Tạo Lấy/Giao/Trả"));
        return this;
    }

    @Step
    public OpsSteps see_error_message(String mess){
        assertThat(loginOpsPage.get_error_message(), is(mess));
        return this;
    }

    @Step
    public OpsSteps then_login_with(String id, String password){
        loginOpsPage.inputID(id);
        loginOpsPage.inputPassword(password);
        loginOpsPage.clickLoginButton();
        return this;
    }

    @Step
    public OpsSteps click_button_choose_driver_and_truck(){
        oP.click_button_choose_driver_and_truck();
        return this;
    }

    @Step
    public OpsSteps and_choose_truck_and_driver(){
        oP.choose_truck();
        oP.choose_driver();
          //String a = oP.TRUCKNUMBERINLIST;
//        String b = TRUCKWEIGHTINLIST;
//        String c = TRUCKPARTNERINLIST;
//        String d = DRIVERNAMEINLIST;
//        String e = DRIVERPHONEINLIST;
        return this;
    }

    @Step
    public OpsSteps then_click_submit_button(){
        oP.click_submit_button();
        return this;
    }

    @Step
    public OpsSteps see_successful_message(String mess){
        assertThat(oP.get_message_content(mess), containsString(mess));
        return this;
    }

    @Step
    public OpsSteps click_create_trip_button(){
        oP.click_create_trip_button();
        return this;
    }

    @Step
    public OpsSteps choose_truck_and_driver_again(){
        oP.click_to_box_truck_driver();
        oP.choose_truck_2();
        oP.choose_driver_2();
        return this;
    }
    @Step
    public OpsSteps open_list_of_halftrip_page(){
        oP.click_to_dropdown_menu_list_trip();
        oP.click_to_menu_list_halftrip();
        return this;
    }

    @Step
    public OpsSteps and_start_trip(){
        oP.click_to_start_trip_button();
        oP.click_submit_button();
        System.out.println("Text = " + oP.get_message_content("Chuyến đi đã được gán đang chạy"));
        assertThat(oP.get_message_content("Chuyến đi đã được gán đang chạy"), containsString("Chuyến đi đã được gán đang chạy"));
        return this;
    }

    @Step
    public OpsSteps then_open_trip_detail_page(){
        oP.click_to_ontrip_tab();
        oP.click_to_trip_detail_button();
        util.switch_to_new_window();
        return this;
    }


}
