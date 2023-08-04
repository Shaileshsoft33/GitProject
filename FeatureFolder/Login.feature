Feature: To test the functionlity of Orange HRM Application

  #created by shailesh
  Scenario: To Test the login page of Orange HRM
    Given user is on login page
    When user enter valid username and valid password
    Then user click on login button

  #Created by Kajal
  Scenario: Test PIM Page Funcatinality
    When user click on PIM Link
    And user click on AddEmplyeeButton
    And user enter FirstName and MiddelName and LastName
    Then click on Save Button
