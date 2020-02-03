Feature: Create order
 As a customer,
 I want to create order,
 in order to send my gift to my friends.

 Background: The user logged in
  Given The user login with username "0932028646" and password "thienlong2304"

 Scenario: Happy Case
  And I am on Create Order form
  When I input all field of order form and submit
  Then Order info will be opened in a new tab

 Scenario: Required fields are blank
  And I am on Create Order form
  When I don't input required field and submit
  Then All required field are red and show warning message
 
 Scenario Outline: Weight is 0
  And I am on Create Order form
  When I input all field but <weight> or <number of items> or <cubic> = 0
  Then Error popup appears
  Examples:
  | weight | number of items | cubic |
  | 0      | 1               | 1000  |
  | 1000   | 0               | 1000  |
  | 1000   | 1               | 0     |

 Scenario: Number of items is 0
  And I am on Create Order form
  When I input all field but number of items = 0
  Then Error popup appears

 Scenario: Cubic is 0
  And I am on Create Order form
  When I input all field but Cubic is 0
  Then Error popup appears
