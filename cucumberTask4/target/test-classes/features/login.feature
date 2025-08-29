Feature: Login with multiple users

  Scenario: Enter multiple credentials
    Given User is on Login Page
    When User logs in with
      | username | password |
      | admin    | admin123 |
      | user1    | pass123  |
    Then Verify login results