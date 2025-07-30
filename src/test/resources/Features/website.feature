Feature: Unilever Website Navigation and Functionality

  Scenario: Navigate to Our Company and Contact Us
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on Our Company
    And I view Our Company
    And I click on Contact Us
    Then I should see the page or modal

  Scenario: Navigate to Suppliers
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on Suppliers
    And I view Suppliers
    Then I should see the page or modal

  Scenario: Navigate to Sustainability and Next Page
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on Sustainability
    Then I should see the page or modal

  Scenario: Navigate to Brands and Search
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on Brands
    And I view Brands
    And I explore more brands
    And I search for brand "closeup"
    Then I should see the page or modal

  Scenario: Navigate to Investors
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on Investors
    Then I should see the page or modal

  Scenario: Navigate to Careers
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on Careers
    And I visit Careers site
    Then I should see the page or modal

  Scenario: Navigate to News and View Latest
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I click on News
    And I view Latest News
    Then I should see the page or modal

  Scenario: Sign up for Email Alerts
    Given I am on the Unilever homepage
    When I accept cookies if present
    And I sign up for email alerts
    Then I should see the page or modal