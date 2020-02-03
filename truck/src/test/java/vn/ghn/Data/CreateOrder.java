package vn.ghn.Data;

import vn.ghn.pages.CustomerPage;

public class CreateOrder extends CustomerPage {
    public static final String SENDERNAME = "Sender";
    public static final String SENDERADDRESS = "653 Phạm Thế Hiển";
    public static final String SENDERFULLADDRESS = get_address_sender();
    public static final String SENDERPHONE = "0932228888";
    public static final String RECEIVERADDRESS = "Cai Lậy";
    public static final String RECEIVERFULLADDRESS = get_address_receiver();
    public static final String RECEIVERNAME = "Receiver";
    public static final String RECEIVERPHONE = "0932227777";
    public static final String EXTERNALCODE = "AUTO" + random_string(4);
    public static final String TRACKINGCODE = "AUTO" + random_string(4);
    public static final String TOTALITEMS = "1";
    public static final String WEIGHT = "1000";
    public static final String D = "10";
    public static final String R = "10";
    public static final String C = "10";
    public static final String CUBIC = "1000";
    public static final String CONTENT = "Auto Content";
    public static final String NOTE = "Auto Note";
    public static final String COD = "1000000";
    public static final String VALUE = "10000000";
    public static final String CHECKITEMS = "100";
    public static final String PAPERDESC = "CTDĐ01";
    public static final String RETURNPAPERDESC = "CTTH01";
    public static final String SENDERDISTRICT = get_district_sender();
    public static final String SENDERPROVINCE = get_province_sender();
    public static final String RECEIVERDISTRICT = get_district_receiver();
    public static final String RECEIVERPROVINCE = get_province_receiver();
    public static final String WARNINGADDRESS = "Vui lòng nhập địa chỉ";
    public static final String WARNINGNAME = "Vui lòng nhập họ tên";
    public static final String WARNINGPHONE = "Vui lòng nhập số điện thoại";
    public static final String WARNINGTOTALITEMS = "Số kiện phải lớn hơn 0";
    public static final String WARNINGWEIGHT = "Khối lượng phải lớn hơn 0";
    public static final String WARNINGCUBIC = "Số khối phải lớn hơn 0";
    public static final String WARNINGCONTENT = "Vui lòng nhập nội dung hàng hoá";

}
