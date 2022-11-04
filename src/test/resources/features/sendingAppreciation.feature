@wip
Feature: user should be able to send appreciation with typing mandatory fields (message title and recipient)
  User story:As a user, I should be able to send appreciation by clicking on Appreciation tab
  from Quick Navigate Menu

  Background: user is already on the login page
    Given user is on the crm login page


  @NEXTBASE-1455@wip
    Scenario Outline: user can send appreciation with typing mandatory fields
      When user type "<username>" into login inputbox
      And user type "<password>" into the password inputbox
      And user clicks the login button
      And user clicks More button and selects Appretiation option
      When user types message into the message field
      And user can see the recipient as 'All employees' by default
      And user clicks send button
      Then verify the appreciation message is sent

      Examples: username and password
        | username                      | password |
        | helpdesk3@cybertekschool.com  | UserUser |
        | hr1@cybertekschool.com        | UserUser |
        | marketing2@cybertekschool.com | UserUser |

  @NEXTBASE-1471@wip
    Scenario: NS; user should see the error message without recipient
      When user type "hr1@cybertekschool.com" into login inputbox
      And user type "UserUser" into the password inputbox
      And user clicks the login button
      And user clicks More button and selects Appretiation option
      And user types message into the message field
      And user can see the recipient as 'All employees' by default
      And user deletes the default recipient
      When user clicks send button
      Then user should see the error message about recipient

  @NEXTBASE-1472@wip
    Scenario: NS; user should see the error message without typing any message
      When user type "hr1@cybertekschool.com" into login inputbox
      And user type "UserUser" into the password inputbox
      And user clicks the login button
      And user clicks More button and selects Appretiation option
      And user can see the recipient as 'All employees' by default
      When user clicks send button
      Then user should see the error message about empty message

  @NEXTBASE-1468@wip
    Scenario: User should be able to cancel sending appreciation at any time before sending.
      When user type "hr1@cybertekschool.com" into login inputbox
      And user type "UserUser" into the password inputbox
      And user clicks the login button
      And user clicks More button and selects Appretiation option
      And user types message into the message field
      And user can see the recipient as 'All employees' by default
      When user clicks cancel button
      Then user should cancel successfully and see the writing Send Message
  @NEXTBASE-1469@wip
  Scenario: 2; User should be able to cancel sending appreciation at any time before sending.
    When user type "hr1@cybertekschool.com" into login inputbox
    And user type "UserUser" into the password inputbox
    And user clicks the login button
    And user clicks More button and selects Appretiation option
    When user clicks cancel button
    Then user should cancel successfully and see the writing Send Message


  @NEXTBASE-1470@wip
  Scenario: User should be able to select an icon and send it.
    When user type "helpdesk2@cybertekschool.com" into login inputbox
    And user type "UserUser" into the password inputbox
    And user clicks the login button
    And user clicks More button and selects Appretiation option
    And user types message into the message field
    And user can see the recipient as 'All employees' by default
    And user clicks the icon
    And user selects an icon and clicks on it
    And user adds a recipient for sending the icon
    And user clicks send button
    Then user should see the icon is sent

  @NEXTBASE-1467@wip
  Scenario: The message delivery should be to 'All employees' by default and should be changeable .
    When user type "helpdesk2@cybertekschool.com" into login inputbox
    And user type "UserUser" into the password inputbox
    And user clicks the login button
    And user clicks More button and selects Appretiation option
    And user types message into the message field
    And user can see the recipient as 'All employees' by default
    And user can click 'Add more' button to add more recipient to sending appreciation
    And user should see three options of recipient(recent, employees and departments, email users)
    When user clicks an option of three delivery groups
    And user should select an expected recipient from there and close pop-up
    And user clicks send button
    Then user should be able to send the appreciation to the recipient

















