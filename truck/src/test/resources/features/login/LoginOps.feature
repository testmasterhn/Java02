Feature: Login Ops Page
  
  Scenario: Show Ops homepage with valid credential
    Given The Ops login page is showed
    When The user provides id "1004" and password "123456" to login
    Then Opspage will be shown
  
  Scenario Outline: Show message with invalid password
    Given The Ops login page is showed
    When The user provides an <invalid Password> and id "1004" to login
    Then The error message "Mã nhân viên hoặc mật khẩu không chính xác" will be showed
    Examples:
      | invalid Password |
      | fdghjk |
  
  Scenario: Show message without id
    Given The Ops login page is showed
    When The user doesn't provide id and provide password "123456"
    Then The error message "Nhập mã nhân viên của bạn" will be showed
  
  Scenario: Show message without password
    Given The Ops login page is showed
    When The user doesn't provide password and provide id "1004"
    Then The error message "Nhập mật khẩu của bạn" will be showed