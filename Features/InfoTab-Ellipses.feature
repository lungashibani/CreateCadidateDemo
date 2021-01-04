Feature: Info Tab - Ellipses

  Scenario: Successful Client contact Ellipses
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User Clicks on Universal Plus Button
    Then Clicks on Client Contact Button
    And User enters First Name of New Client as "Joe"
    Then User enters family Name of New Client as "Trust"
#    When User Enters Job Title of New Client as "Tester"
#    And User enters an Organisation Menu Item of New client as "Org"
    #Then User clicks on Organisation Name
    #And Click on Create button for new Client




