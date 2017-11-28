#Author: Sedhu Madhavan
@CreateCredit
Feature: Verify Create Credit Application for Auto Gravity

  Scenario: Verify creating a new application for BMW with Valid Details
    Given User launches an "IE" browser
    And navigates to the HomePage
    When user selects "BMW" car Make and "2 Series" Model
    And user enters zipcode "91381"
    And user selects the first model and reviews the details in ReviewDetails screen
    Then Verify the presence of all fields in Search For Financing screen
    And Close the browser

  Scenario: Verify creating a new application for Audi with Valid Details
    Given User launches an "IE" browser
    And navigates to the HomePage
    When user selects "Audi" car Make and "A4" Model
    And user enters zipcode "91381"
    And user selects the first model and reviews the details in ReviewDetails screen
    Then Verify the presence of all fields in Search For Financing screen
    And Close the browser

    Scenario: Verify creating a new application for Toyota with Valid Details
    Given User launches an "IE" browser
    And navigates to the HomePage
    When user selects "Toyota" car Make and "Yaris" Model
    And user enters zipcode "90007"
    And user selects the first model and reviews the details in ReviewDetails screen
    Then Verify the presence of all fields in Search For Financing screen
    And Close the browser
    