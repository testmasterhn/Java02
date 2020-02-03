Feature: Import order
  As a customer,
  I want to import order,
  in order to create a list of my order.

  Background: The user logged in
    Given The user login with username "0932028646" and password "thienlong2304"
    
  Scenario: Happy Case
    And I am on Import Order form
    When I click to button import
    And I choose import file
    And I click to check button
    And I click to create button
    Then The "Yêu cầu tạo đơn hàng đang được xử lý, vui lòng kiểm tra kết quả tại phần Lịch sử sau it phút!" message will appeared
    And The page will be redirected to Import History
    