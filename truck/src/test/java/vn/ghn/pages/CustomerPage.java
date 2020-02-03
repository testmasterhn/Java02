package vn.ghn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
@DefaultUrl("http://staging-truck.ghn.vn/#/login")
public class CustomerPage extends PageObject {

    //Create Order elements
    @FindBy(id = "address_sender")
    private static WebElementFacade inputAddressSender;

    @FindBy(id = "address_receiver")
    private static WebElementFacade inputAddressReceiver;

    @FindBy(xpath = "(//input[@id = \"fullname\"])[1]")
    private WebElementFacade inputNameSender;

    @FindBy(xpath = "(//input[@id = \"fullname\"])[2]")
    private WebElementFacade inputNameReceiver;

    @FindBy(xpath = "(//input[@id = \"phone\"])[1]")
    private WebElementFacade inputPhoneSender;

    @FindBy(xpath = "(//input[@id = \"phone\"])[2]")
    private WebElementFacade inputPhoneReceiver;

    @FindBy(id = "external_code")
    private WebElementFacade inputExternalCode;

    @FindBy(id = "tracking_code")
    private WebElementFacade inputTrackingCode;

    @FindBy(id = "number_of_items")
    private WebElementFacade inputTotalItems;

    @FindBy(id = "weight")
    private WebElementFacade inputWeight;

    @FindBy(xpath = "//input[@placeholder = \"Dài\"]")
    private WebElementFacade inputD;

    @FindBy(xpath = "//input[@placeholder = \"Rộng\"]")
    private WebElementFacade inputR;

    @FindBy(xpath = "//input[@placeholder = \"Cao\"]")
    private WebElementFacade inputC;

    @FindBy(id = "cubic_num")
    private WebElementFacade inputCubic;

    @FindBy(id = "cod")
    private WebElementFacade txtConvertedWeight;

    @FindBy(id = "content")
    private WebElementFacade txtareaContent;

    @FindBy(id = "note")
    private WebElementFacade txtareaNote;

    @FindBy(xpath = "//input[@placeholder= \"Số tiền cần thu hộ (COD)\"]")
    private WebElementFacade inputCOD;

    @FindBy(xpath = "//label[@for = \"inlineCheckbox1\"]")
    private WebElementFacade checkboxValueFee;

    @FindBy(xpath = "//label[@for = \"inlineCheckbox2\"]")
    private WebElementFacade checkboxLiftFee;

    @FindBy(xpath = "//label[@for = \"inlineCheckbox3\"]")
    private WebElementFacade checkboxCheckFee;

    @FindBy(xpath = "//input[@placeholder = \"Giá trị hàng hoá\"]")
    private WebElementFacade inputValue;

    @FindBy(xpath = "//label[text() = \"Số sản phẩm đồng kiểm \"]/following-sibling::div/input")
    private WebElementFacade inputCheckItem;

    @FindBy(xpath = "(//div[@class=\"col-12 col-md-4\"]//label[@for=\"weight\"]/following-sibling::div/input)[1]")
    private WebElementFacade orderFee;

    @FindBy(xpath = "(//a[@class=\"pull-right custom-add-paper\"])[1]")
    private WebElementFacade btnAddPaper;

    @FindBy(xpath = "(//a[@class=\"pull-right custom-add-paper\"])[2]")
    private WebElementFacade btnAddReturnPaper;

    @FindBy(xpath = "//button[@class=\"pull-right btn btn-success\"]")
    private WebElementFacade btnSubmit;

    @FindBy(xpath = "(//div[contains(text() ,  \" - \")])[2]")
    private static WebElementFacade ddlDistrictSender;

    @FindBy(xpath = "(//div[contains(text() ,  \" - \")])[1]")
    private static WebElementFacade ddlProvinceSender;

    @FindBy(xpath = "(//div[contains(text() ,  \" - \")])[4]")
    private static WebElementFacade ddlDistrictReceiver;

    @FindBy(xpath = "(//div[contains(text() ,  \" - \")])[3]")
    private static WebElementFacade ddlProvinceReceiver;

    @FindBy(xpath = "//input[@placeholder = \"Ngày lấy dự kiến\"]")
    private WebElementFacade inputDatePick;

    @FindBy(xpath = "//input[@placeholder = \"Ngày giao dự kiến\"]")
    private WebElementFacade inputDateDelivery;

    @FindBy(xpath = "//label[text() = \"Khối lượng bốc xếp (kg)\"]/following-sibling::div/input")
    private WebElementFacade inputLiftWeight;

    @FindBy(xpath = "//input[@placeholder = \"Cước thu hộ (VNĐ)\"]")
    private WebElementFacade inputCodFee;

    @FindBy(xpath = "//li[@class = \"import-order-cls nav-item\"]/a[text() = \"Import đơn hàng\"]")
    private WebElementFacade menuImportLTL;

    @FindBy(xpath = "//input[@id = \"upload-file-order\"]/..")
    private WebElementFacade buttonImportLTL;

    @FindBy(xpath = "//input[@id = \"upload-file-order\"]")
    private WebElementFacade inputImportLTL;

    @FindBy(xpath = "//button[contains(@class,  \"btn-green\")]")
    private WebElementFacade btnCheckImport;

    //Locator path
    private By locatorMenuCreateOrder = By.xpath("//li[@class = \"create-order-cls nav-item\"]");

    private By locatorInputPaper = By.xpath("(//label[@for=\"dimension\"]/following-sibling::input)[1]");

    private By locatorInputReturnPaper = By.xpath("(//label[@for=\"dimension\"]/following-sibling::input)[2]");

    private By locatorPopupConfirmation = By.xpath("//h5[@class=\"modal-title\"]");

    private By locatorNamePhoneSenderPopup = By.xpath("(//label[@class=\"label-order-details\"])[1]" +
            "/following-sibling::b");

    private By locatorSenderPopup = By.xpath("//b[text() = \"Người gửi:\"]/../..");

    private By locatorReceiverPopup = By.xpath("//b[text() = \"Người nhận:\"]/../..");

    private By locatorNamePhoneReceiverPopup = By.xpath("(//label[@class=\"label-order-details\"])[5]" +
            "/following-sibling::b");

    private By locatorWeightPopup = By.xpath("//b[contains(text(), \"kg\")]");

    private By locatorItemsPopup = By.xpath("(//b[contains(text(), \"kiện\")])[2]");

    private By locatorCubicPopup = By.xpath("(//b[text() = \"Số khối: \"]/../following-sibling::b)[1]");

    private By locatorDRCPopup = By.xpath("//b[contains(text(), \"cm\")]");

    private By locatorContentPopup = By.xpath("(//label[@class = \"label-order-details\"])[9]/..");

    private By locatorCodPopup = By.xpath("(//b[text() = \"Thu hộ (COD): \"]/../following-sibling::b)[1]");

    private By locatorOrderFeePopup = By.xpath("//b[text() = \"Cước phí:\"]/../following-sibling::b");

    private By locatorDatePopup = By.xpath("//b[text() = \"Dự kiến lấy:\"]/../..");

    private By locatorValuePopup = By.xpath("(//b[text() = \"Giá trị hàng hoá: \"]/../following-sibling::b)[1]");

    private By locatorLiftWeightPopup = By.xpath("(//b[text() = \"Khối lượng bốc xếp: \"]/../following-sibling::b)[1]");

    private By locatorCheckItemsPopup = By.xpath("//b[text() = \"Số sản phẩm đồng kiểm: \"]/../following-sibling::b");

    private By locatorCodFeePopup = By.xpath("(//b[text() = \"Cước thu hộ:\"]/../following-sibling::b)[1]");

    private By locatorValueFeePopup = By.xpath("(//b[text() = \"Cước phí khai giá:\"]/../following-sibling::b)[1]");

    private By locatorLiftFeePopup = By.xpath("(//b[text() = \"Cước bốc xếp:\"]/../following-sibling::b)[1]");

    private By locatorCheckFeePopup = By.xpath("(//b[text() = \"Cước đồng kiểm:\"]/../following-sibling::b)[1]");

    private By locatorValueFee = By.xpath("//input[@placeholder = \"Cước phí khai giá (VNĐ)\"]");

    private By locatorLiftFee = By.xpath("//label[text() = \"Cước bốc xếp (VNĐ/kg) \"]/following-sibling::div/input");

    private By locatorCheckFee = By.xpath("//label[text() = \"Cước đồng kiểm (VNĐ) \"]/following-sibling::div/input");

    private By locatorConfirmPopupButton = By.xpath("//button[@class = \"tbtn-create-order btn btn-success\"]");

    private By locatorAddress = By.xpath("//a[@class = \"dropdown-item hover\"]");

    //Warning message
    private By locatorWarningAddressSender = By.xpath("//input[@id = \"address_sender\"]/following-sibling::span");

    private By locatorWarningAddressReceiver = By.xpath("//input[@id = \"address_receiver\"]/following-sibling::span");

    private By locatorWarningNameSender = By.xpath("(//input[@id = \"fullname\"])[1]/../following-sibling::span");

    private By locatorWarningPhoneSender = By.xpath("(//input[@id = \"phone\"])[1]/../following-sibling::span");

    private By locatorWarningNameReceiver = By.xpath("(//input[@id = \"fullname\"])[2]/../following-sibling::span");

    private By locatorWarningPhoneReceiver = By.xpath("(//input[@id = \"phone\"])[2]/../following-sibling::span");

    private By locatorWarningTotalItems = By.xpath("//input[@id = \"number_of_items\"]/../following-sibling::span");

    private By locatorWarningWeight = By.xpath("//input[@id = \"weight\"]/../following-sibling::span");

    private By locatorWarningCubic = By.xpath("//input[@id = \"cubic_num\"]/../following-sibling::span");

    private By locatorWarningContent = By.xpath("//textarea[@id = \"content\"]/following-sibling::span");

    private By locatorWarningMessage = By.xpath("//div[@role = \"alert\"]");

    //Import
    private By locatorMenuTitle = By.xpath("//div[@class = \"custom-title-h3  remove-bottom\"]/h3");

    private By locatorEditButton = By.xpath("(//button[contains(@class,  \"btn-import-editing\")])[1]");

    private By locatorTitlePopupImport = By.xpath("//h5[@class =  \"modal-title\"]/label");

    private By locatorItemsImport = By.xpath("//tr[@class =  \"tr-pointers \"]");

    private By locatorItemsImportPopup = By.xpath("//div[@class =  \"custom-processing-content\"]");

    private By locator_process_popup = By.xpath("(//div[@class =  \"custom-processing\"]/b)[1]");

    private By locatorCreateOrderButton = By.xpath("//button[text() =  \"Tạo đơn\"]");

    private By locatorProgressBarCheck = By.xpath("//div[@role = \"progressbar\" and @aria-valuenow = \"100\"]");

    private By locatorSessionTitle = By.xpath("//div[@class = \"tab-pane active\"]//th[text() = \"Mã phiên\"]");


    public void press_enter(){
        WebElementFacade address = find(locatorAddress);
        address.sendKeys(Keys.RETURN);
    }

    public void show_create_order_menu(){
        WebElementFacade menuCreateOrder = find(locatorMenuCreateOrder);
        waitFor(menuCreateOrder).waitUntilVisible();
        assertThat(menuCreateOrder.getText(), is("Tạo đơn"));
    }

    public static String random_string(int num){
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < num) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString() + rnd.nextInt(99);
    }

    //Sender
    public void enter_address_sender(String address){
        this.enter(address).into(inputAddressSender);
    }

    public void enter_name_sender(String name){
        this.enter(name).into(inputNameSender);
    }

    public void enter_phone_sender(String phone){
        this.enter(phone).into(inputPhoneSender);
    }

    //Receiver
    public void enter_name_receiver(String name){
        this.enter(name).into(inputNameReceiver);
    }

    public void enter_phone_receiver(String phone){
        this.enter(phone).into(inputPhoneReceiver);
    }

    public void enter_address_receiver(String address){
        this.enter(address).into(inputAddressReceiver);
    }

    //Order info
    public void enter_external_code(String code){
        this.enter(code).into(inputExternalCode);
    }

    public void enter_tracking_code(String code){
        this.enter(code).into(inputTrackingCode);
    }

    public void enter_total_items(String items){
        this.enter(items).into(inputTotalItems);
    }

    public void enter_weight(String weight){
        this.enter(weight).into(inputWeight);
    }

    public void enter_D(String D){
        inputD.clear();
        this.enter(D).into(inputD);
    }

    public void enter_R(String R){
        inputR.clear();
        this.enter(R).into(inputR);
    }

    public void enter_C(String C){
        inputC.clear();
        this.enter(C).into(inputC);
    }

    public void enter_cubic(String cubic){
        this.enter(cubic).into(inputCubic);
    }

    public String get_converted_weight(){
        return txtConvertedWeight.getValue();
    }

    public void enter_content(String content){
        this.enter(content).into(txtareaContent);
    }

    public void enter_note(String note){
        this.enter(note).into(txtareaNote);
    }

    public void choose_checkbox_value_fee(){
        this.clickOn(checkboxValueFee);
    }

    public void choose_checkbox_lift_fee(){
        this.clickOn(checkboxLiftFee);
    }

    public void choose_checkbox_check_fee(){
        this.clickOn(checkboxCheckFee);
    }

    public void enter_cod(String cod){
        this.enter(cod).into(inputCOD);
    }

    public void enter_value(String value){
        this.enter(value).into(inputValue);
    }

    public void enter_check_items(String items){
        this.enter(items).into(inputCheckItem);
    }

    public String getOrderFee(){
        return orderFee.getValue();
    }

    public void click_add_paper(){
        this.clickOn(btnAddPaper);
    }

    public void enter_paper_description(String description){
        WebElementFacade inputPaperDescription = find(locatorInputPaper);
        this.enter(description).into(inputPaperDescription);
    }

    public void click_add_return_paper(){
        this.clickOn(btnAddReturnPaper);
    }

    public void enter_return_paper_description(String description){
        WebElementFacade inputReturnPaperDescription = find(locatorInputReturnPaper);
        this.enter(description).into(inputReturnPaperDescription);
    }

    public void click_submit_button(){
        this.clickOn(btnSubmit);
    }

    public String get_popup_title(){
        WebElementFacade titlePopupConfirmation = find(locatorPopupConfirmation);
        waitFor(titlePopupConfirmation).waitUntilVisible();
        return titlePopupConfirmation.getText();
    }

    public static String get_province_sender(){
        String[] province = ddlProvinceSender.getText().split(" - ");
        return "Tỉnh/TP: " + province[1];
    }

    public static String get_district_sender(){
        return "Quận/Huyện: " + ddlDistrictSender.getText();
    }

    public static String get_province_receiver(){
        String[] province = ddlProvinceReceiver.getText().split(" - ");
        return "Tỉnh/TP: " + province[1];
    }

    public static String get_district_receiver(){
        return "Quận/Huyện: " + ddlDistrictReceiver.getText();
    }

    public static String get_address_sender(){
        return "Đ/c gửi: " + inputAddressSender.getValue();
    }

    public static String get_address_receiver(){
        return "Đ/c nhận: " + inputAddressReceiver.getValue();
    }

    //Popup confirm order
    public String get_name_sender_in_popup(){
        WebElementFacade namephoneSenderPopup = find(locatorNamePhoneSenderPopup);
        String[] splitNameAndPhone = namephoneSenderPopup.getText().split(" - ");
        return splitNameAndPhone[0];
    }

    public String get_phone_sender_in_popup(){
        WebElementFacade namephoneSenderPopup = find(locatorNamePhoneSenderPopup);
        String[] splitNameAndPhone = namephoneSenderPopup.getText().split(" - ");
        return splitNameAndPhone[1];
    }

    public String get_sender_info_in_popup(String part){
        String a = find(locatorSenderPopup).getText();
        String[] b = a.split("\n");
        switch (part) {
            case "district":
                return b[1];
            case "province":
                return b[2];
            case "address":
                return b[3];
            default:
                return null;
        }
    }

    public String get_receiver_info_in_popup(String part){
        String a = find(locatorReceiverPopup).getText();
        String[] b = a.split("\n");
        switch (part) {
            case "district":
                return b[1];
            case "province":
                return b[2];
            case "address":
                return b[3];
            default:
                return null;
        }
    }

    public String get_date_info_in_popup(String time){
        String a = find(locatorDatePopup).getText();
        String[] b = a.split("(Dự kiến lấy: )|(\nDự kiến giao: )");
        switch (time) {
            case "pick":
                return b[1];
            case "delivery":
                return b[2];
            default:
                return null;
        }
    }

    public String get_name_receiver_in_popup(){
        WebElementFacade namephoneReceiverPopup = find(locatorNamePhoneReceiverPopup);
        String[] splitNameAndPhone = namephoneReceiverPopup.getText().split(" - ");
        return splitNameAndPhone[0];
    }

    public String get_phone_receiver_in_popup(){
        WebElementFacade namephoneReceiverPopup = find(locatorNamePhoneReceiverPopup);
        String[] splitNameAndPhone = namephoneReceiverPopup.getText().split(" - ");
        return splitNameAndPhone[1];
    }

    public String get_weight_in_popup(){
        return convert_string_into_num(locatorWeightPopup);
    }

    public String get_weight(){
        return inputWeight.getValue();
    }

    public String get_items_in_popup(){
        WebElementFacade itemsPopup = find(locatorItemsPopup);
        String[] items = itemsPopup.getText().split(" kiện");
        return items[0];
    }

    public String get_cubic_in_popup(){
        return convert_string_into_num(locatorCubicPopup);
    }

    public String get_cubic(){
        return inputCubic.getValue();
    }

    public String get_DRC_in_popup(){
        WebElementFacade DRCPopup = find(locatorDRCPopup);
        return DRCPopup.getText();
    }

    public String get_DRC(){
        String d = inputD.getValue();
        String r = inputR.getValue();
        String c = inputC.getValue();
        return d + " x " + r + " x " + c + " cm";
    }

    public String get_content_in_popup(){
        WebElementFacade contentPopup = find(locatorContentPopup);
        String[] content = contentPopup.getText().split("(?<name>Nội dung: )");
        return content[1];
    }

    public String convert_string_into_num(By locator){
        String[] strings = find(locator).getText().split("(,)|( VNĐ)|( kg)|( m³)");
        StringBuilder temp_string = new StringBuilder();
        String num = strings[0];
        for (int i = 0; i < strings.length - 1; i++){
            temp_string.append(strings[i]);
            num = temp_string + strings[i + 1] ;
        }
        return num;
    }

    public String get_cod_in_popup(){
        return convert_string_into_num(locatorCodPopup);
    }

    public String get_value_in_popup(){
        return convert_string_into_num(locatorValuePopup);
    }

    public String get_lift_weight_in_popup(){
        String[] lift_weight = find(locatorLiftWeightPopup).getText().split(" kg");
        return lift_weight[0];
    }

    public String get_check_items_in_popup(){
        return convert_string_into_num(locatorCheckItemsPopup);
    }

    public String get_lift_weight(){
        return inputLiftWeight.getValue();
    }

    public String get_order_fee(){
        return orderFee.getValue();
    }

    public String get_order_fee_in_popup(){
        WebElementFacade orderFeePopup = find(locatorOrderFeePopup);
        String[] fee = orderFeePopup.getText().split("( VNĐ)");
        return fee[0];
    }

    public String get_pick_date(){
        return inputDatePick.getValue();
    }

    public String get_delivery_date(){
        return inputDateDelivery.getValue();
    }

    public String get_cod_fee_popup(){
        return find(locatorCodFeePopup).getText().split(" VNĐ")[0];
    }

    public String get_value_fee_popup(){
        return find(locatorValueFeePopup).getText().split(" VNĐ")[0];
    }

    public String get_lift_fee_popup(){
        return find(locatorLiftFeePopup).getText().split(" VNĐ")[0];
    }

    public String get_check_fee_popup(){
        return find(locatorCheckFeePopup).getText().split(" VNĐ")[0];
    }

    public String get_cod_fee(){
        return inputCodFee.getValue();
    }

    public String get_value_fee(){
        WebElementFacade inputValueFee = find(locatorValueFee);
        return inputValueFee.getValue();
    }

    public String get_lift_fee(){
        WebElementFacade inputLiftFee = find(locatorLiftFee);
        return inputLiftFee.getValue();
    }

    public String get_check_fee(){
        WebElementFacade inputCheckFee = find(locatorCheckFee);
        return inputCheckFee.getValue();
    }

    public void click_confirm_button(){
        WebElementFacade btnConfirmPopup = find(locatorConfirmPopupButton);
        waitFor(btnConfirmPopup).waitUntilVisible();
        this.clickOn(btnConfirmPopup);
    }

    //Warning mess
    public String get_warning_sender_address(){
        return find(locatorWarningAddressSender).getText();
    }

    public String get_warning_sender_name(){
        return find(locatorWarningNameSender).getText();
    }

    public String get_warning_sender_phone(){
        return find(locatorWarningPhoneSender).getText();
    }

    public String get_warning_receiver_address(){
        return find(locatorWarningAddressReceiver).getText();
    }

    public String get_warning_receiver_name(){
        return find(locatorWarningNameReceiver).getText();
    }

    public String get_warning_receiver_phone(){
        return find(locatorWarningPhoneReceiver).getText();
    }

    public String get_warning_number_of_items(){
        return find(locatorWarningTotalItems).getText();
    }

    public String get_warning_weight(){
        return find(locatorWarningWeight).getText();
    }

    public String get_warning_cubic(){
        return find(locatorWarningCubic).getText();
    }

    public String get_warning_content(){
        return find(locatorWarningContent).getText();
    }

    public void switch_to_new_tab() {
        this.waitForCondition().until(ExpectedConditions.numberOfWindowsToBe(2));
        for(String winHandle : getDriver().getWindowHandles()){
            this.getDriver().switchTo().window(winHandle);
        }
    }

    public String get_title(){
        return find(locatorMenuTitle).getText();
    }

    public String get_error_message(){
        WebElementFacade warningMessage = find(locatorWarningMessage);
        waitFor(warningMessage).waitUntilPresent();
        return warningMessage.getText();
    }

    public String get_total_items(){
        return inputTotalItems.getValue();
    }

    public void open_import_form(){
        waitFor(menuImportLTL).waitUntilClickable();
        this.clickOn(menuImportLTL);
        WebElementFacade menuTitle = find(locatorMenuTitle);
        waitFor(menuTitle).waitUntilVisible();
    }

    public void click_import_button(){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("document.addEventListener('click', function(evt) { if (evt.target.type === 'file') evt.preventDefault(); }, true) ");
        waitFor(buttonImportLTL).waitUntilClickable();
        this.clickOn(buttonImportLTL);
    }

    public void get_import_file(String file){
        this.getDriver().switchTo().activeElement().sendKeys(file);
        WebElementFacade buttonEditImport = find(locatorEditButton);
        this.waitFor(buttonEditImport).waitUntilVisible();
    }

    public void click_check_button(){
        this.clickOn(btnCheckImport);
    }

    public String get_title_popup_import(){
        WebElementFacade titlePopup = find(locatorTitlePopupImport);
        waitFor(titlePopup).waitUntilVisible();
        return titlePopup.getText();
    }

    public String get_items_import(){
        List<WebElementFacade> items_import = findAll(locatorItemsImport);
        return String.valueOf(items_import.size());
    }

    public String get_items_import_popup(){
        WebElementFacade items_import = find(locatorItemsImportPopup);
        String[] strings = items_import.getText().split("(\\nĐơn)|(Tổng đơn )");
        return strings[1];
    }

    public String get_process_popup(){
        WebElementFacade processPopup = find(locator_process_popup);
        withTimeoutOf(Duration.ofSeconds(60))
                .waitFor(ExpectedConditions.textToBePresentInElement(processPopup, "100 %"));
        return processPopup.getText();
    }

    public void click_create_button(){
        WebElementFacade createOrderBtn = find(locatorCreateOrderButton);

        waitFor(createOrderBtn).waitUntilClickable();
        this.clickOn(createOrderBtn);
    }

    public void wait_check_progress_bar_full(){
        WebElementFacade checkProgressBar = find(locatorProgressBarCheck);
        withTimeoutOf(Duration.ofSeconds(60)).waitFor(checkProgressBar).waitUntilPresent();
    }

    public String get_session_title(){
        WebElementFacade sessionTitle = find(locatorSessionTitle);
        waitFor(sessionTitle).waitUntilVisible();
        return sessionTitle.getText();
        //List<String> listime = new List<>;
    }

}
