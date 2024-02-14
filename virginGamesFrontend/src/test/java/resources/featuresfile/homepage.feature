Feature: virgin games homepage functionality
  As a user,
  would like to navigate to homepage succeessfully


  Scenario:user should navigate to homepage functionality
    Given user is on homepage
    When user clicks on accept all cookies
    Then user verify welcome message "Welcome to Virgin Games"
  @test
  Scenario:user is on casino page
    Given user is on homepage
    When user clicks on accept all cookies
    And  see there are 8 classic casino games
    Then prints name of all popular casino games