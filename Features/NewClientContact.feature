Feature: New Client Contact

  Scenario: Successful Created New Client Contact
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User Clicks on Universal Plus Button
    Then Clicks on Client Contact Button
    And User enters First Name of New Client as "New QA 3"
    Then User enters family Name of New Client as "New QA 3"
    When User Enters Job Title of New Client as "Tester"
    And User enters an Organisation Menu Item of New client as "Postman Organisation"
#    Then User clicks on Organisation Item
#    Then User clicks on Organisation Name
#    When Clicks on Current Position Contact Details Plus button
#    And Clicks on Mobile Phone
#    Then Enters Mobile Phone as "0426272733"

    #And Click on Create button for new Client




