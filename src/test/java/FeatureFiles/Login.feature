Feature:  Login Functionality

  Scenario: Login as a Teacher
    Given Navigate to Campus
    When Enter "teacher" username and password
    Then User should login successfully


  Scenario: Login as a Student
    Given Navigate to Campus
    When Enter "student" username and password
    Then User should login successfully


  Scenario: Login as a Admin
    Given Navigate to Campus
    When Enter "admin" username and password
    Then User should login successfully