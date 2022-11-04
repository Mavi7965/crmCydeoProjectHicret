@smoke
Feature: Login function with different user types
  Accounts are : hr1, helpdesk,marketing


  Background: user is on the login page
    Given user is on the crm login page

    @login
    Scenario Template: user should be able to log in with different credentials
      When user type "<username>" into login inputbox
      And user type "<password>" into the password inputbox
      And user clicks the login button
      Then verify that user should see crm home page

      Examples: credentials
        | username                      | password |
        | helpdesk2@cybertekschool.com  | UserUser |
        | hr1@cybertekschool.com        | UserUser |
        | marketing2@cybertekschool.com | UserUser |

