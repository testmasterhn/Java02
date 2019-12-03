Feature: As an customer, I want to login to Truck Customer page

  Scenario: Show Customer homepage with valid credential
    Given The Customer login page is showed
    When The user provides a valid credential to login
    Then Homepage will be shown

  Scenario Outline: Show message with invalid password
    Given The Customer login page is showed
    When The user provides an <invalid Password> to login
    Then The message "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại" will be showed
    Examples:
      | invalid Password |
      | fdghjk |

  Scenario: Show message without email or phone
    Given The Customer login page is showed
    When The user doesn't provide email or phone
    Then The message "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại" will be showed

  Scenario: Show message without password
    Given The Customer login page is showed
    When The user doesn't provide password
    Then The message "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại" will be showed