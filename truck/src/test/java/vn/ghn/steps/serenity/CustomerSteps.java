package vn.ghn.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.ghn.pages.CustomerPage;
import vn.ghn.pages.LoginCustomerPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static vn.ghn.Data.CreateOrder.*;
import static vn.ghn.Data.ImportOrder.HAPPYCASE;

public class CustomerSteps {
    LoginCustomerPage loginCustomerPage;
    CustomerPage customer;

    //Login Customer page
    @Step
    public void see_error_text(String errorText){
        assertThat(loginCustomerPage.getErrorText(), is(equalTo(errorText)));
    }

    @Step
    public CustomerSteps open_customer_page(){
        loginCustomerPage.open();
        return this;
    }

    @Step
    public CustomerSteps enters_phone(String phone) {
        loginCustomerPage.enter_phone(phone);
        return this;
    }

    @Step
    public CustomerSteps then_enters_password(String password) {
        loginCustomerPage.enter_password(password);
        return this;
    }

    @Step
    public CustomerSteps enters_password(String password) {
        loginCustomerPage.enter_password(password);
        return this;
    }

    @Step
    public CustomerSteps then_click_login_button(){
        loginCustomerPage.click_submit_button();
        return this;
    }

    @Step
    public CustomerSteps should_see_customer_page_is_open(String createOrderText) {
        assertThat(loginCustomerPage.getCreateOrderText(), is(createOrderText));
        return this;
    }

    @Step
    public CustomerSteps then_login_with(String phone, String password){
        loginCustomerPage.enter_phone(phone);
        loginCustomerPage.enter_password(password);
        loginCustomerPage.click_submit_button();
        return this;
    }

    @Step
    public void see_menu_create_order(){
        customer.show_create_order_menu();
    }

    //Create order sender
    @Step
    public CustomerSteps enters_address_sender(String address){
        customer.enter_address_sender(address);
        return this;
    }

    @Step
    public CustomerSteps then_hit_enter(){
        customer.press_enter();
        return this;
    }

    @Step
    public CustomerSteps enters_name_sender(String name){
        customer.enter_name_sender(name);
        return this;
    }

    @Step
    public CustomerSteps enters_phone_sender(String phone){
        customer.enter_phone_sender(phone);
        return this;
    }

    //Create order receiver
    @Step
    public CustomerSteps enters_name_receiver(String name){
        customer.enter_name_receiver(name);
        return this;
    }

    @Step
    public CustomerSteps enters_address_receiver(String address){
        customer.enter_address_receiver(address);
        return this;
    }

    @Step
    public CustomerSteps enters_phone_receiver(String phone){
        customer.enter_phone_receiver(phone);
        return this;
    }

    //Create order info
    @Step
    public CustomerSteps enters_external_code(String code){
        customer.enter_external_code(code);
        return this;
    }

    @Step
    public CustomerSteps enters_tracking_code(String code){
        customer.enter_tracking_code(code);
        return this;
    }

    @Step
    public CustomerSteps enters_total_items(String items){
        customer.enter_total_items(items);
        return this;
    }

    @Step
    public CustomerSteps enters_weight(String weight){
        customer.enter_weight(weight);
        return this;
    }

    @Step
    public CustomerSteps enters_DRC(String D, String R, String C){
        customer.enter_D(D);
        customer.enter_R(R);
        customer.enter_C(C);
        return this;
    }

    @Step
    public CustomerSteps enters_cubic(String cubic){
        customer.enter_cubic(cubic);
        return this;
    }

    @Step
    public CustomerSteps check_converted_weight(){
        assertThat(customer.get_converted_weight(), is(not(equalTo("0"))));
        return this;
    }

    @Step
    public CustomerSteps enters_content(String content){
        customer.enter_content(content);
        return this;
    }

    @Step
    public CustomerSteps enters_note(String note){
        customer.enter_note(note);
        return this;
    }

    @Step
    public CustomerSteps clicks_value_fee(){
        customer.choose_checkbox_value_fee();
        return this;
    }

    @Step
    public CustomerSteps clicks_lift_fee(){
        customer.choose_checkbox_lift_fee();
        return this;
    }

    @Step
    public CustomerSteps clicks_check_fee(){
        customer.choose_checkbox_check_fee();
        return this;
    }

    @Step
    public CustomerSteps then_enters_cod(String cod){
        customer.enter_cod(cod);
        return this;
    }

    @Step
    public CustomerSteps then_enters_value(String value){
        customer.enter_value(value);
        return this;
    }

    @Step
    public CustomerSteps and_enters_check_items(String items){
        customer.enter_check_items(items);
        return this;
    }

    @Step
    public CustomerSteps then_check_order_fee(){
        assertThat(customer.getOrderFee(), is(not(equalTo("0"))));
        String a = SENDERDISTRICT;
        String b = SENDERPROVINCE;
        String c = SENDERFULLADDRESS;
        return this;
    }

    @Step
    public CustomerSteps click_button_add_paper(){
        customer.click_add_paper();
        return this;
    }

    @Step
    public CustomerSteps then_enter_paper_description(String description){
        customer.enter_paper_description(description);
        return this;
    }

    @Step
    public CustomerSteps click_button_return_add_paper(){
        customer.click_add_return_paper();
        return this;
    }

    @Step
    public CustomerSteps then_enter_return_paper_description(String description){
        customer.enter_return_paper_description(description);
        return this;
    }

    @Step
    public CustomerSteps then_click_submit_button(){
        customer.click_submit_button();
        return this;
    }

    @Step
    public CustomerSteps and_see_popup_confirmation(){
        assertThat(customer.get_popup_title(), is(equalTo("Xác nhận thông tin tạo đơn hàng")));
        return this;
    }

    @Step
    public CustomerSteps then_check_lift_weight(){
        assertThat(customer.get_lift_weight(), is(equalTo(customer.get_converted_weight())));
        return this;
    }

    @Step
    public CustomerSteps then_check_order_info_again(){
        //Sender info
        assertThat(customer.get_name_sender_in_popup(), is(equalTo(SENDERNAME)));
        assertThat(customer.get_phone_sender_in_popup(), is(equalTo(SENDERPHONE)));
        assertThat(customer.get_sender_info_in_popup("district"), is(equalTo(SENDERDISTRICT)));
        assertThat(customer.get_sender_info_in_popup("province"), is(equalTo(SENDERPROVINCE)));
        assertThat(customer.get_sender_info_in_popup("address"), is(equalTo(SENDERFULLADDRESS)));

        //Receiver info
        assertThat(customer.get_name_receiver_in_popup(), is(equalTo(RECEIVERNAME)));
        assertThat(customer.get_phone_receiver_in_popup(), is(equalTo(RECEIVERPHONE)));
        assertThat(customer.get_receiver_info_in_popup("district"), is(equalTo(RECEIVERDISTRICT)));
        assertThat(customer.get_receiver_info_in_popup("province"), is(equalTo(RECEIVERPROVINCE)));
        assertThat(customer.get_receiver_info_in_popup("address"), is(equalTo(RECEIVERFULLADDRESS)));

        //Order info
        assertThat(customer.get_weight_in_popup(), is(equalTo(customer.get_weight())));
        assertThat(customer.get_items_in_popup(), is(equalTo(customer.get_total_items())));
        assertThat(customer.get_cubic_in_popup(), is(equalTo(customer.get_cubic())));
        assertThat(customer.get_DRC_in_popup(), is(equalTo(customer.get_DRC())));
        assertThat(customer.get_content_in_popup(), is(equalTo(CONTENT)));

        //Date
        assertThat(customer.get_date_info_in_popup("pick"), is(equalTo(customer.get_pick_date())));
        assertThat(customer.get_date_info_in_popup("delivery"), is(equalTo(customer.get_delivery_date())));

        //Fee
        assertThat(customer.get_order_fee_in_popup(), is(equalTo(customer.get_order_fee())));
        assertThat(customer.get_cod_in_popup(), is(equalTo(COD)));
        assertThat(customer.get_value_in_popup(), is(equalTo(VALUE)));
        assertThat(customer.get_lift_weight_in_popup(), is(equalTo(customer.get_lift_weight())));
        assertThat(customer.get_check_items_in_popup(), is(equalTo(CHECKITEMS)));
        assertThat(customer.get_cod_fee_popup(), is(equalTo(customer.get_cod_fee())));
        assertThat(customer.get_value_fee_popup(), is(equalTo(customer.get_value_fee())));
        assertThat(customer.get_lift_fee_popup(), is(equalTo(customer.get_lift_fee())));
        assertThat(customer.get_check_fee_popup(), is(equalTo(customer.get_check_fee())));
        return this;
    }

    @Step
    public CustomerSteps then_click_confirm_button_in_popup(){
        customer.click_confirm_button();
        return this;
    }

    @Step
    public CustomerSteps see_new_tab_is_opened(){
        customer.switch_to_new_tab();
        assertThat(customer.get_title(), is(startsWith("Thông tin đơn hàng: ")));
        return this;
    }

    @Step
    public CustomerSteps see_error_message(String message){
        assertThat(customer.get_error_message(), is(equalTo(message)));
        return this;
    }

    //Warning messages
    @Step
    public CustomerSteps see_warning_messages_for_required_fields(){
        assertThat(customer.get_warning_sender_address(), is(equalTo(WARNINGADDRESS)));
        assertThat(customer.get_warning_sender_name(), is(equalTo(WARNINGNAME)));
        assertThat(customer.get_warning_sender_phone(), is(equalTo(WARNINGPHONE)));
        assertThat(customer.get_warning_receiver_address(), is(equalTo(WARNINGADDRESS)));
        assertThat(customer.get_warning_receiver_name(), is(equalTo(WARNINGNAME)));
        assertThat(customer.get_warning_receiver_phone(), is(equalTo(WARNINGPHONE)));
        assertThat(customer.get_warning_number_of_items(), is(equalTo(WARNINGTOTALITEMS)));
        assertThat(customer.get_warning_weight(), is(equalTo(WARNINGWEIGHT)));
        assertThat(customer.get_warning_cubic(), is(equalTo(WARNINGCUBIC)));
        assertThat(customer.get_warning_content(), is(equalTo(WARNINGCONTENT)));
        return this;
    }

    //Import order
    @Step
    public CustomerSteps click_on_import_menu(){
        customer.open_import_form();
        return this;
    }

    @Step
    public CustomerSteps and_import_menu_will_be_opened(){
        assertThat(customer.get_title(), is(equalTo("Import đơn hàng")));
        return this;
    }

    @Step
    public CustomerSteps click_on_import_button(){
        customer.click_import_button();
        return this;
    }

    @Step
    public CustomerSteps choose_import_file(){
        customer.get_import_file(HAPPYCASE);
        return this;
    }

    @Step
    public CustomerSteps click_check_button(){
        customer.click_check_button();
        assertThat(customer.get_title_popup_import(), is(equalTo("Xác nhận tạo đơn hàng")));
        return this;
    }

    @Step
    public CustomerSteps then_click_create_import_popup(){
        assertThat(customer.get_process_popup(), is(equalTo("100 %")));
        customer.wait_check_progress_bar_full();
        customer.click_create_button();
        return this;
    }

    @Step
    public CustomerSteps check_info_import(){
        assertThat(customer.get_items_import(), is(equalTo(customer.get_items_import_popup())));
        return this;
    }

    @Step
    public CustomerSteps see_page_redirect_to_history_import(){
        assertThat(customer.get_session_title(), is(equalTo("MÃ PHIÊN")));
        return this;
    }

}
