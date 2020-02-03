Feature: Halftrip full flow
  Background: The ops logged in
    Given The ops login with id "1005" and password "123456"
  
  Scenario: Pick trip without order
    And I am on Create HalfTrip page
    When I create trip without assigning order
    And I open trip detail
    And I finish trip
    Then The successful message "Chuyến đi đã được chuyển sang trạng thái kết thúc" will be appeared
  
  Scenario: Change truck driver when create trip
    And I am on Create HalfTrip page
    When I create trip with changed truck driver without assigning order
    And I open trip detail
    And I finish trip
    Then The successful message "Chuyến đi đã được chuyển sang trạng thái kết thúc" will be appeared
    
