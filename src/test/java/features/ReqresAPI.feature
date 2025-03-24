Feature: View and Update User via Reqres API

  Scenario: View user with ID 2
    When I send a GET request to "/api/users/2"
    Then the response status should be 200
    And the response should contain "id": 2

  Scenario: Update user with PUT
    When I send a PUT request to "/api/users/2" with body:
      """
      {
        "name": "morpheus",
        "job": "zion resident"
      }
      """
    Then the response status should be 200
    And the response should contain "job": "zion resident"