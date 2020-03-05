Feature: users on table of offline website 
@SmokeTest
Scenario: Existing user Verification
    Given open users page "https://www.javabykiran.com/demo"
    When  table is displayed
    Then  verify users data
      | Name    | Email           |
      | Java | java@jbk.com |
      | By     | by@jbk.com   |
      | Kiran    | kiran@jbk.org  |